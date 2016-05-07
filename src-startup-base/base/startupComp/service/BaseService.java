package base.startupComp.service;

import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.apache.ibatis.session.RowBounds;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import base.startupComp.mapper.IBaseMapper;
import base.startupComp.model.OptResult;
import base.startupComp.model.PageData;
import base.startupComp.model.PageRequest;

/**
 * <h1>基础服务</h1>
 * User: zhangtao
 * Date: 13-11-17
 * Time: 下午10:59
 */
public abstract class BaseService<M, E, K extends Serializable> implements IBaseService<M, E, K> {
	private static final long serialVersionUID = -1666364201802785958L;
	/**
     * 错误码定�?
     */
    protected Properties errorCodes;

    /**
     * 初始�?
     */
    protected void init(){
        try {
            errorCodes = PropertiesLoaderUtils.loadProperties(new ClassPathResource("error-code.properties"));
        } catch (IOException e) {
            // TODO 错误处理
        }
    }

    /**
     * 获取Mapper
     * @return
     */
    public abstract IBaseMapper<M, E, K> getMapper();

    /**
     * 新增实体
     *
     * @param entity
     * @return
     */
    public OptResult create(M entity) {
        if (entity == null) {
            return new OptResult(false, "param.null");
        }
        int count = getMapper().insertSelective(entity);
        if (count > 0) {
            return new OptResult(true);
        }
        return new OptResult(false, "database.error");
    }

    /**
     * 更新实体
     *
     * @param entity
     * @return
     */
    @Override
    public OptResult update(M entity) {
        if (entity == null) {
            return new OptResult(false, "param.null");
        }
        // TODO 增加�?��主键是否有�?
        int count = getMapper().updateByPrimaryKeySelective(entity);
        if (count > 0) {
            return new OptResult(true);
        }
        return new OptResult(false, "database.error");
    }

    /**
     * 根据ID删除实体
     *
     * @param entityId
     * @return
     */
    @Override
    public OptResult remove(K entityId) {
        if (entityId == null) {
            return new OptResult(false, "param.null");
        }
        int count = getMapper().deleteByPrimaryKey(entityId);
        if (count > 0) {
            return new OptResult(true);
        }
        return new OptResult(false, "database.error");
    }
    
    /**
     * 根据ID删除实体
     *
     * @param entityId
     * @return
     */
    @Override
    public OptResult delete(E condition) {
        if (condition == null) {
            return new OptResult(false, "param.null");
        }
        getMapper().deleteByExample(condition);
        return OptResult.success();
    }

    /**
     * 根据ID获取实体
     *
     * @param entityId
     * @return
     */
    @Override
    public M getById(K entityId) {
        if (entityId == null) {
            return null;
        }
        return getMapper().selectByPrimaryKey(entityId);
    }

    /**
     * 根据条件查询实体
     *
     * @param condition
     * @return
     */
    @SuppressWarnings("unchecked")
	@Override
    public PageData<M> query(PageRequest<E> condition) {
        int count = getMapper().countByExample(condition.getCondition());
        List<M> data = null;
        if (count > 0) {
            data = getMapper().selectByExample(condition.getCondition(), new RowBounds(condition.getStart(), condition.getLimit()));
        } else {
            data = Collections.EMPTY_LIST;
        }
        PageData<M> result = new PageData<M>();
        result.setTotal(count);
        result.setStart(condition.getStart());
        result.setLimit(condition.getLimit());
        result.setData(data);
        result.setSuccess(true);
        return result;
    }
    
    @SuppressWarnings("unchecked")
    public List<M> getResult(E condition) {
        try {
            return getMapper().selectByExample(condition);
        } catch (Exception e) {
            // TODO 考虑异常处理机制
        }
        return Collections.EMPTY_LIST;
    };
    
    /**
     * 获取给定条件的结果数�?
     * @param condition
     * @return
     */
    public int getResultCount(E condition) {
    	try {
        	return getMapper().countByExample(condition);
		} catch (Exception e) {
			// TODO 考虑异常处理机制
		}
    	return 0;
    }

    public Properties getErrorCodes() {
        return errorCodes;
    }

    public void setErrorCodes(Properties errorCodes) {
        this.errorCodes = errorCodes;
    }

    /**
     * 查找错误消息
     *
     * @param errorCode
     * @return
     */
    protected String getErrorMsg(String errorCode) {
        return getErrorCodes().getProperty(errorCode);
    }
}

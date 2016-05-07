package base.startupComp.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import base.startupComp.model.OptResult;
import base.startupComp.model.PageData;
import base.startupComp.model.PageRequest;

/**
 * <h1>基础服务定义</h1>
 * User: zhangtao
 * Date: 13-11-24
 * Time: 上午10:03
 */
public interface IBaseService<M, E, K> extends Serializable {
	
    /**
     * 新增实体
     *
     * @param entity
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    OptResult create(M entity);

    /**
     * 更新实体
     *
     * @param entity
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    OptResult update(M entity);

    /**
     * 根据ID删除实体
     *
     * @param entityId
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    OptResult remove(K entityId);
    
    /**
     * 根据套件删除实体
     * @param condition
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED)
    OptResult delete(E condition);

    /**
     * 根据ID获取实体
     *
     * @param entityId
     * @return
     */
    M getById(K entityId);

    /**
     * 根据条件查询实体
     *
     * @param condition
     * @return
     */
    PageData<M> query(PageRequest<E> condition);
    /**
     * 查询符合给定条件的实体列�?
     * @param condition
     * @return
     */
    List<M> getResult(E condition);
    /**
     * 查询符合给定条件的实体数�?
     * @param condition
     * @return
     */
    int getResultCount(E condition);
}

package base.startupComp.model;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

public class OptResult {
	/**
	 * 是否成功
	 */
    private boolean success;
    /**
     * 错误码
     */
    private String errorCode;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 错误信息
     */
    private String errorMessage;
    /**
     * 返回的数据项
     */
    private Object data;
    /**
     * 错误码
     */
    private static Properties errorCodes;
    /**
     * Logger
     */
    private static Logger logger = Logger.getLogger(OptResult.class);

    /**
     * 初始化错误码
     */
    static {
        try {
            logger.debug("从类路径加载[error-code.properties]文件...");
            errorCodes = PropertiesLoaderUtils.loadProperties(new ClassPathResource("error-code.properties"));
            logger.info("加载错误码文件成功！");
        } catch (IOException ex) {
            logger.error("从资源文件[error-code.properties]加载错误码文件错误!", ex);
        }
    }

    /**
     * 默认构造
     */
    public OptResult() {
    }
    /**
     * success result
     * @return
     */
    public static OptResult success() {
    	return new OptResult(true);
    }
    /**
     * failure result
     * @param errorCode
     * @return
     */
    public static OptResult failure(String errorCode) {
    	return new OptResult(false, errorCode);
    }

    /**
     * 单参数构造
     *
     * @param success
     */
    public OptResult(boolean success) {
        this.success = success;
    }

    /**
     * 双参数构造
     * @param success
     * @param errorCode
     */
    public OptResult(boolean success, String errorCode) {
        this.success = success;
        this.errorCode = errorCode;
        if (errorCodes != null) {
            try {
                this.errorMessage = errorCodes.getProperty(errorCode, errorCode);
            } catch (Exception e) {
            	this.errorMessage = errorCode;
            }
            
        }
    }
    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        if(errorCode != null) {
            this.errorMessage = errorCodes.getProperty(errorCode);
        }
        if (StringUtils.isBlank(this.errorMessage)) {
			this.errorMessage = this.errorCode;
		}
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OptResult)) return false;

        OptResult optResult = (OptResult) o;

        if (success != optResult.success) return false;
        if (errorCode != null ? !errorCode.equals(optResult.errorCode) : optResult.errorCode != null) return false;
        if (errorMessage != null ? !errorMessage.equals(optResult.errorMessage) : optResult.errorMessage != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (success ? 1 : 0);
        result = 31 * result + (errorCode != null ? errorCode.hashCode() : 0);
        result = 31 * result + (errorMessage != null ? errorMessage.hashCode() : 0);
        return result;
    }

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
}

package com.sunivo.lgs.web.valueobject.beans;

import java.io.Serializable;

import com.sunivo.lgs.web.valueobject.constants.enums.AlertMessageLevel;

/**
 * 信息对象
 * 
 * @author chengjianfang@sunivo.com
 * 
 *         2013-10-22 下午4:57:55
 */
public class AlertMessageObject implements Serializable {
    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    /**
     * 信息
     */
    private final String message;

    /**
     * 级别
     */
    private final AlertMessageLevel level;

    /**
     * 消息内容参数构造方法，默认使用默认级别
     * 
     * @param message
     *            消息内容
     */
    public AlertMessageObject(String message) {
        this(message, AlertMessageLevel.DEFAULT);
    }

    /**
     * 全参构造方法
     * 
     * @param message
     *            消息内容
     * @param level
     *            消息级别
     */
    public AlertMessageObject(String message, AlertMessageLevel level) {
        this.message = message;
        this.level = level;
    }

    /**
     * @return 消息内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return 级别
     */
    public AlertMessageLevel getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return "ErrorObject{level='" + level + "' message='" + message + "'}";
    }
}
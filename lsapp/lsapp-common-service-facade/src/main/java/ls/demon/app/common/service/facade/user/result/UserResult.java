/**
 * Witontek.com.
 * Copyright (c) 2012-2014 All Rights Reserved.
 */
package ls.demon.app.common.service.facade.user.result;

import ls.demon.app.common.service.facade.common.result.BaseResult;

/**
 * 用户操作处理结果
 * 
 * @author song.li@witontek.com
 * @version $Id: UserResult.java, v 0.1 2014年8月5日 下午3:58:50 song.li@witontek.com Exp $
 */
public class UserResult extends BaseResult {

    /** SUID */
    private static final long serialVersionUID = 1513173842370597772L;

    /** 访问令牌号 */
    private String            accessToken;

    /**
     * Getter method for property <tt>accessToken</tt>.
     * 
     * @return property value of accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Setter method for property <tt>accessToken</tt>.
     * 
     * @param accessToken value to be assigned to property accessToken
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

}

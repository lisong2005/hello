/**
 * Witontek.com.
 * Copyright (c) 2012-2014 All Rights Reserved.
 */
package ls.demon.app.biz.service.impl.user;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import ls.demon.app.common.service.facade.user.UserService;
import ls.demon.app.common.service.facade.user.model.User;
import ls.demon.app.common.service.facade.user.result.UserResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UserServiceImpl.java, v 0.1 2014年8月5日 下午4:05:50 song.li@witontek.com Exp $
 */
@WebService(endpointInterface = "ls.demon.app.common.service.facade.user.UserService")
public class UserServiceImpl implements UserService, InitializingBean {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Resource
    WebServiceContext           wsContext;

    /** 
     * @see ls.demon.app.common.service.facade.user.UserService#createUser(ls.demon.app.common.service.facade.user.model.User)
     */
    @Override
    public UserResult createUser(User user) {
        logger.info("创建用户 {} {} {}", user, wsContext,
            wsContext != null ? wsContext.getMessageContext() : null);
        UserResult result = new UserResult();

        result.setSuccess(true);
        result.setResultCode("success");
        result.setResultMsg("成功");
        return result;
    }

    /** 
     * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.warn("UserServiceImpl.init {}", this);
    }

}

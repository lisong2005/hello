/**
 * LS_Demon Org.
 * Copyright (c) 2005-2014 All Rights Reserved.
 */
package ls.demon.app.biz.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.wss4j.common.ext.WSPasswordCallback;

/**
 * 
 * @author lisong
 * @version $Id: ServerPasswordCallback.java, v 0.1 2014年8月7日 下午4:44:39 lisong Exp $
 */
public class ServerPasswordCallback implements CallbackHandler {
    /**
    * Logger for this class
    */
    private static final Logger logger    = LoggerFactory.getLogger(ServerPasswordCallback.class);

    private Map<String, String> passwords = new HashMap<String, String>();

    public ServerPasswordCallback() {
        passwords.put("admin", "123456");
        passwords.put("test", "123");
    }

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        logger.info("WSPasswordCallback={}", ToStringBuilder.reflectionToString(callbacks));
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
            logger.info("WSPasswordCallback={}", ToStringBuilder.reflectionToString(pc));
            logger.info("WSPasswordCallback {},{}", pc.getIdentifier(), pc.getPassword());
            if (!passwords.containsKey(pc.getIdentifier()))
                throw new RuntimeException("用户不匹配！");
            String pass = passwords.get(pc.getIdentifier());
            String pwd = pc.getPassword();
            if (pwd == null || !pwd.equals(pass)) {
                throw new RuntimeException("密码不匹配！");
            }
        }
    }
}

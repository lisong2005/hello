/**
 * LS_Demon Org.
 * Copyright (c) 2005-2014 All Rights Reserved.
 */
package ls.demon.app.biz.service.impl.user;

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
 * @version $Id: ClientPasswordCallback.java, v 0.1 2014年8月7日 下午5:28:22 lisong Exp $
 */
public class ClientPasswordCallback implements CallbackHandler {
    /**
    * Logger for this class
    */
    private static final Logger logger    = LoggerFactory.getLogger(ClientPasswordCallback.class);

    private Map<String, String> passwords = new HashMap<String, String>();

    public ClientPasswordCallback() {
        passwords.put("admin", "password");
        passwords.put("test", "123");
    }

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        logger.debug("{}", ToStringBuilder.reflectionToString(callbacks));
        
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pc = (WSPasswordCallback) callbacks[i];
            int usage = pc.getUsage();
            if (!passwords.containsKey(pc.getIdentifier()))
                throw new RuntimeException("用户【" + pc.getIdentifier() + "】不存在！");

            String pass = passwords.get(pc.getIdentifier());

            if (usage == WSPasswordCallback.USERNAME_TOKEN && pass != null) {
                pc.setPassword(pass);
                return;
            }
        }
    }
}

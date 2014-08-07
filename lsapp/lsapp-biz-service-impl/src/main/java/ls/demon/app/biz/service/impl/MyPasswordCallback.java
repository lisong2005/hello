/**
 * LS_Demon Org.
 * Copyright (c) 2005-2014 All Rights Reserved.
 */
package ls.demon.app.biz.service.impl;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

/**
 * 
 * @author lisong
 * @version $Id: MyPasswordCallback.java, v 0.1 2014年8月7日 下午6:18:21 lisong Exp $
 */
public class MyPasswordCallback implements CallbackHandler {

    /** 
     * @see javax.security.auth.callback.CallbackHandler#handle(javax.security.auth.callback.Callback[])
     */
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {

        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];

        if (pc.getIdentifier().equals("admin")) {
            // set the password on the callback. This will be compared to the
            // password which was sent from the client.
            pc.setPassword("password");
        }
    }

}

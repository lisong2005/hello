/**
 * LS_Demon Org.
 * Copyright (c) 2005-2014 All Rights Reserved.
 */
package ls.demon.app.biz.service.impl.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

import ls.demon.app.biz.service.impl.BaseRemoteTest;
import ls.demon.app.common.service.facade.user.UserService;
import ls.demon.app.common.service.facade.user.model.User;
import ls.demon.app.common.service.facade.user.result.UserResult;

import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.junit.Test;

/**
 * 
 * @author lisong
 * @version $Id: UserServiceImplTest.java, v 0.1 2014年8月7日 下午2:24:52 lisong Exp $
 */
public class UserServiceImplTest extends BaseRemoteTest {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);

    @Test
    public void testCreateUserRemote() {
        try {
            UserService client = (UserService) context.getBean("userService");
            User user = new User();
            user.setUserName("username");
            user.setPassword("abc");
            user.setRealName("zhangsan");
            user.setPid("3111111111111111111");
            user.setEmail("aa@aa.com");
            UserResult response = client.createUser(user);
            logger.info("Response: " + response);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    @Test
    public void testCreateUser2Remote() {
        try {
            UserService client = (UserService) context.getBean("userService2");
            User user = new User();
            user.setUserName("username");
            user.setPassword("abc");
            user.setRealName("zhangsan");
            user.setPid("3111111111111111111");
            user.setEmail("aa@aa.com");
            UserResult response = client.createUser(user);
            logger.info("Response: " + response);
        } catch (Exception e) {
            logger.error("", e);
        }
    }

    public static void main(String[] args) {
        try {
            //调用WebService
            JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

            //        ClientProxy proxy = (ClientProxy) Proxy.getInvocationHandler(chartService);
            //        Client client = proxy.getClient();

            Map<String, Object> outProps = new HashMap<String, Object>();
            outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
            outProps.put(WSHandlerConstants.USER, "admin");
            outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_DIGEST);
            outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS,
                ClientPasswordCallback.class.getName());
            //        client.getOutInterceptors().add(new SAAJOutInterceptor());
            //        client.getOutInterceptors().add(new WSS4JOutInterceptor(outProps));
            //        WSS4JOutInterceptor wssOut = new WSS4JOutInterceptor(outProps);
            factory.getOutInterceptors().add(new WSS4JOutInterceptor(outProps));
            factory.getOutInterceptors().add(new SAAJOutInterceptor());
            factory.getOutInterceptors().add(new LoggingOutInterceptor());

            factory.getInInterceptors().add(new LoggingInInterceptor());

            factory.setAddress("http://localhost:8080/lsapp/services/UserService");
            factory.setServiceClass(UserService.class);
            UserService chartService = (UserService) factory.create();

            User user = new User();
            user.setUserName("username________");
            user.setPassword("abc");
            user.setRealName("zhangsan");
            user.setPid("3111111111111111111");
            user.setEmail("aa@aa.com");
            System.out.println(chartService.createUser(user));
        } catch (Exception e) {
            logger.error("", e);
        }
    }

}

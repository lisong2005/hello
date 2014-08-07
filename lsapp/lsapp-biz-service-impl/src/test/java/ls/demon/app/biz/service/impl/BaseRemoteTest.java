/**
 * LS_Demon Org.
 * Copyright (c) 2005-2014 All Rights Reserved.
 */
package ls.demon.app.biz.service.impl;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author lisong
 * @version $Id: BaseRemoteTest.java, v 0.1 2014年8月7日 下午2:22:07 lisong Exp $
 */
public class BaseRemoteTest {
    /**
     * Logger for this class
     */
    protected final Logger       logger = LoggerFactory.getLogger(this.getClass());

    protected ApplicationContext context;

    @Before
    public void setup() {
        context = new ClassPathXmlApplicationContext(
            new String[] { "/META-INF/spring/client-beans.xml" });
    }
}

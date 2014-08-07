/**
 * LS_Demon Org.
 * Copyright (c) 2005-2014 All Rights Reserved.
 */
package ls.demon.app.biz.daemon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ls.demon.app.common.util.DateUtil;

import org.junit.Test;

/**
 * 
 * @author lisong
 * @version $Id: XXTest.java, v 0.1 2014年8月2日 下午9:02:00 lisong Exp $
 */
public class XXTest {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(XXTest.class);

    @Test
    public void testZ() {
        logger.debug("{}", "test");
        DateUtil.test();
    }
}

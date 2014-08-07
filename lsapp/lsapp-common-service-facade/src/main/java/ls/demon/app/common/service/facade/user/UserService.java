/**
 * Witontek.com.
 * Copyright (c) 2012-2014 All Rights Reserved.
 */
package ls.demon.app.common.service.facade.user;

import javax.jws.WebService;

import ls.demon.app.common.service.facade.user.model.User;
import ls.demon.app.common.service.facade.user.result.UserResult;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: UserService.java, v 0.1 2014年8月5日 下午3:51:56 song.li@witontek.com Exp $
 */
@WebService
public interface UserService {

    /**
     * 
     * @param user
     * @return
     */
    public UserResult createUser(User user);
}

/**
 * Witontek.com.
 * Copyright (c) 2012-2014 All Rights Reserved.
 */
package ls.demon.app.common.service.facade.common.model;

import java.io.Serializable;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

/**
 * 
 * @author song.li@witontek.com
 * @version $Id: BaseModel.java, v 0.1 2014年8月5日 下午3:59:33 song.li@witontek.com Exp $
 */
public class BaseModel implements Serializable {

    /** SUID */
    private static final long serialVersionUID = -6959919042763345196L;

    /** 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}

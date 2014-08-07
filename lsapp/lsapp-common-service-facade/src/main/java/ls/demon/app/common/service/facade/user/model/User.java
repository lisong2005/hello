/**
 * Witontek.com.
 * Copyright (c) 2012-2014 All Rights Reserved.
 */
package ls.demon.app.common.service.facade.user.model;

import ls.demon.app.common.service.facade.common.model.BaseModel;

/**
 * 用户对象
 * 
 * @author song.li@witontek.com
 * @version $Id: User.java, v 0.1 2014年8月5日 下午3:52:49 song.li@witontek.com Exp $
 */
public class User extends BaseModel {

    /** SUID */
    private static final long serialVersionUID = 3901546053294892250L;

    /** 登录名 */
    private String            userName;

    /** 登录密码 */
    private String            password;

    /** 用户名 */
    private String            realName;

    /** 个人身份证 */
    private String            pid;

    /** 电话/手机号码 */
    private String            phoneNo;

    /** 电子邮箱 */
    private String            email;

    /** 区域码 */
    private String            localNo;

    /**
     * Getter method for property <tt>userName</tt>.
     * 
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     * 
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>password</tt>.
     * 
     * @return property value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for property <tt>password</tt>.
     * 
     * @param password value to be assigned to property password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Getter method for property <tt>realName</tt>.
     * 
     * @return property value of realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Setter method for property <tt>realName</tt>.
     * 
     * @param realName value to be assigned to property realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * Getter method for property <tt>pid</tt>.
     * 
     * @return property value of pid
     */
    public String getPid() {
        return pid;
    }

    /**
     * Setter method for property <tt>pid</tt>.
     * 
     * @param pid value to be assigned to property pid
     */
    public void setPid(String pid) {
        this.pid = pid;
    }

    /**
     * Getter method for property <tt>phoneNo</tt>.
     * 
     * @return property value of phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Setter method for property <tt>phoneNo</tt>.
     * 
     * @param phoneNo value to be assigned to property phoneNo
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * Getter method for property <tt>email</tt>.
     * 
     * @return property value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Setter method for property <tt>email</tt>.
     * 
     * @param email value to be assigned to property email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter method for property <tt>localNo</tt>.
     * 
     * @return property value of localNo
     */
    public String getLocalNo() {
        return localNo;
    }

    /**
     * Setter method for property <tt>localNo</tt>.
     * 
     * @param localNo value to be assigned to property localNo
     */
    public void setLocalNo(String localNo) {
        this.localNo = localNo;
    }

}

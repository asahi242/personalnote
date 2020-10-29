package com.asahi.personalnote.domain.base;

/**
 * @Author：asahi
 * @Date：2020/10/27 10:41:40
 * @Description：
 */
import org.springframework.stereotype.Component;
@Component
public class Theme {
    /**
     * 主题ID
     */
    private Integer id;

    /**
     * 主题名
     */
    private String themename;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 是否上锁： 0不上锁  1上锁
     */
    private Byte islock;

    /**
     * 主题锁密码
     */
    private String lockpassword;

    /**
     * 密码提示
     */
    private String passwordhint;

    /**
     * 创建时间
     */
    private Long createtime;

    /**
     * 修改时间
     */
    private Long modifytime;

    /**
     * 是否删除：0不删除 1删除 
     */
    private Byte isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getThemename() {
        return themename;
    }

    public void setThemename(String themename) {
        this.themename = themename == null ? null : themename.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Byte getIslock() {
        return islock;
    }

    public void setIslock(Byte islock) {
        this.islock = islock;
    }

    public String getLockpassword() {
        return lockpassword;
    }

    public void setLockpassword(String lockpassword) {
        this.lockpassword = lockpassword == null ? null : lockpassword.trim();
    }

    public String getPasswordhint() {
        return passwordhint;
    }

    public void setPasswordhint(String passwordhint) {
        this.passwordhint = passwordhint == null ? null : passwordhint.trim();
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Long getModifytime() {
        return modifytime;
    }

    public void setModifytime(Long modifytime) {
        this.modifytime = modifytime;
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }
}
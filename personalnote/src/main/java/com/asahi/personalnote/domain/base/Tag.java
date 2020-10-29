package com.asahi.personalnote.domain.base;

/**
 * @Author：asahi
 * @Date：2020/10/27 10:41:40
 * @Description：
 */
import org.springframework.stereotype.Component;
@Component
public class Tag {
    /**
     * 标签ID
     */
    private Integer id;

    /**
     * 标签名
     */
    private String tagname;

    /**
     * 用户ID
     */
    private Integer userid;

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

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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
package com.asahi.personalnote.domain.base;

/**
 * @Author：asahi
 * @Date：2020/10/27 10:41:40
 * @Description：
 */
import org.springframework.stereotype.Component;
@Component
public class Comment {
    /**
     * 评论ID
     */
    private Integer id;

    /**
     * 根评论ID
     */
    private Integer rootid;

    /**
     * 笔记ID
     */
    private Integer noteid;

    /**
     * 评论用户ID
     */
    private Integer fromuserid;

    /**
     * 被评论用户ID
     */
    private Integer touserid;

    /**
     * 评论内容
     */
    private String commentcontent;

    /**
     * 创建时间
     */
    private Long createtime;

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

    public Integer getRootid() {
        return rootid;
    }

    public void setRootid(Integer rootid) {
        this.rootid = rootid;
    }

    public Integer getNoteid() {
        return noteid;
    }

    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
    }

    public Integer getFromuserid() {
        return fromuserid;
    }

    public void setFromuserid(Integer fromuserid) {
        this.fromuserid = fromuserid;
    }

    public Integer getTouserid() {
        return touserid;
    }

    public void setTouserid(Integer touserid) {
        this.touserid = touserid;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent == null ? null : commentcontent.trim();
    }

    public Long getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Long createtime) {
        this.createtime = createtime;
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }
}
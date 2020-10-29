package com.asahi.personalnote.domain.base;

/**
 * @Author：asahi
 * @Date：2020/10/27 10:41:40
 * @Description：
 */
import org.springframework.stereotype.Component;
@Component
public class Note {
    /**
     * 笔记ID
     */
    private Integer id;

    /**
     * 主题ID
     */
    private Integer themeid;

    /**
     * 标题
     */
    private String title;

    /**
     * 是否共享：0不共享 1共享
     */
    private Byte isshare;

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

    /**
     * 内容
     */
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getThemeid() {
        return themeid;
    }

    public void setThemeid(Integer themeid) {
        this.themeid = themeid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Byte getIsshare() {
        return isshare;
    }

    public void setIsshare(Byte isshare) {
        this.isshare = isshare;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
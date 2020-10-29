package com.asahi.personalnote.domain.base;

/**
 * @Author：asahi
 * @Date：2020/10/27 10:41:40
 * @Description：
 */
import org.springframework.stereotype.Component;
@Component
public class TagNote {
    /**
     * 标签笔记关联ID
     */
    private Integer id;

    /**
     * 标签ID
     */
    private Integer tagid;

    /**
     * 笔记ID
     */
    private Integer noteid;

    /**
     * 创建时间
     */
    private Long createtime;

    /**
     * 修改时间
     */
    private Long modifytime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    public Integer getNoteid() {
        return noteid;
    }

    public void setNoteid(Integer noteid) {
        this.noteid = noteid;
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
}
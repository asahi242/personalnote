package com.asahi.personalnote.domain.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class QueryUserVo {
    /**
     * 用户ID
     */
    private Integer id;

    /**
     * 根据条件查询
     */
    private String query;

    /**
     * 是否删除：0不删除 1删除
     */
    private Byte isdelete;

    /**
     * 权限：0管理员 1用户
     */
    private Integer power;
    /**
     * 当前页数
     */
    private Integer page;
    /**
     * 每页显示个数
     */
    private Integer size;
}

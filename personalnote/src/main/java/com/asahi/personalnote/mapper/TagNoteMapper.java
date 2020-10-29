package com.asahi.personalnote.mapper;

import com.asahi.personalnote.domain.base.TagNote;
import com.asahi.personalnote.domain.base.TagNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagNoteMapper {
    long countByExample(TagNoteExample example);

    int deleteByExample(TagNoteExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TagNote record);

    int insertSelective(TagNote record);

    List<TagNote> selectByExample(TagNoteExample example);

    TagNote selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TagNote record, @Param("example") TagNoteExample example);

    int updateByExample(@Param("record") TagNote record, @Param("example") TagNoteExample example);

    int updateByPrimaryKeySelective(TagNote record);

    int updateByPrimaryKey(TagNote record);
}
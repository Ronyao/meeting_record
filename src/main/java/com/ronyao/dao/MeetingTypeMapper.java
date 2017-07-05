package com.ronyao.dao;

import com.ronyao.bean.MeetingType;
import com.ronyao.bean.MeetingTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingTypeMapper {
    long countByExample(MeetingTypeExample example);

    int deleteByExample(MeetingTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(MeetingType record);

    int insertSelective(MeetingType record);

    List<MeetingType> selectByExample(MeetingTypeExample example);

    MeetingType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") MeetingType record, @Param("example") MeetingTypeExample example);

    int updateByExample(@Param("record") MeetingType record, @Param("example") MeetingTypeExample example);

    int updateByPrimaryKeySelective(MeetingType record);

    int updateByPrimaryKey(MeetingType record);

    List<MeetingType> getAllType();
}
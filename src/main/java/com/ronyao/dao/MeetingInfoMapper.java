package com.ronyao.dao;

import com.ronyao.bean.MeetingInfo;
import com.ronyao.bean.MeetingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingInfoMapper {
    long countByExample(MeetingInfoExample example);

    int deleteByExample(MeetingInfoExample example);

    int deleteByPrimaryKey(Integer meetingId);

    int insert(MeetingInfo record);

    int insertSelective(MeetingInfo record);

    List<MeetingInfo> selectByExample(MeetingInfoExample example);

    MeetingInfo selectByPrimaryKey(Integer meetingId);

    int updateByExampleSelective(@Param("record") MeetingInfo record, @Param("example") MeetingInfoExample example);

    int updateByExample(@Param("record") MeetingInfo record, @Param("example") MeetingInfoExample example);

    int updateByPrimaryKeySelective(MeetingInfo record);

    int updateByPrimaryKey(MeetingInfo record);
}
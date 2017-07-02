package com.ronyao.dao;

import com.ronyao.bean.MeetingFile;
import com.ronyao.bean.MeetingFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MeetingFileMapper {
    long countByExample(MeetingFileExample example);

    int deleteByExample(MeetingFileExample example);

    int deleteByPrimaryKey(Integer fileId);

    int insert(MeetingFile record);

    int insertSelective(MeetingFile record);

    List<MeetingFile> selectByExample(MeetingFileExample example);

    MeetingFile selectByPrimaryKey(Integer fileId);

    int updateByExampleSelective(@Param("record") MeetingFile record, @Param("example") MeetingFileExample example);

    int updateByExample(@Param("record") MeetingFile record, @Param("example") MeetingFileExample example);

    int updateByPrimaryKeySelective(MeetingFile record);

    int updateByPrimaryKey(MeetingFile record);
}
package com.ronyao.dao;

import com.ronyao.bean.MettingType;
import com.ronyao.bean.MettingTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MettingTypeMapper {
    long countByExample(MettingTypeExample example);

    int deleteByExample(MettingTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(MettingType record);

    int insertSelective(MettingType record);

    List<MettingType> selectByExample(MettingTypeExample example);

    MettingType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") MettingType record, @Param("example") MettingTypeExample example);

    int updateByExample(@Param("record") MettingType record, @Param("example") MettingTypeExample example);

    int updateByPrimaryKeySelective(MettingType record);

    int updateByPrimaryKey(MettingType record);
}
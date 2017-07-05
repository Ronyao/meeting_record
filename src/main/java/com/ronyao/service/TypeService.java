package com.ronyao.service;

import com.ronyao.bean.MeetingType;
import com.ronyao.dao.MeetingTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 17.7.5.
 */
@Service
public class TypeService {

    @Autowired
    MeetingTypeMapper meetingTypeMapper;

    public List<MeetingType> getAllType() {
        return meetingTypeMapper.getAllType();
    }

}

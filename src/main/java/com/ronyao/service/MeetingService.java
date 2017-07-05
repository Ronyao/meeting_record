package com.ronyao.service;

import com.ronyao.bean.MeetingInfo;
import com.ronyao.dao.MeetingInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 17.7.4.
 */
@Service
public class MeetingService {
    @Autowired
    MeetingInfoMapper meetingInfoMapper;

    public int addMeetingInfo(MeetingInfo record){
        return meetingInfoMapper.insert(record);
    }

    public List<MeetingInfo> getAllMeetingInfo() {
        return meetingInfoMapper.getAllMeetingInfo();
    }
}

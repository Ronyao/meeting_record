package com.ronyao.controller;

import com.ronyao.bean.MeetingInfo;
import com.ronyao.bean.Msg;
import com.ronyao.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by DELL on 17.7.4.
 */
@Controller
public class MeetingController {

    @Autowired
    MeetingService meetingService;

    @GetMapping("/addMeeting")
    public String getAddMeetingPage(){
        return "addMeeting";
    }

    @GetMapping("/meetinglist")
    public String getMeetingListPage(){ return "meetinglist"; }

    @GetMapping("/getMeetingWithPage")
    @ResponseBody
    public Msg getMeetingWithPage(){
        List<MeetingInfo> meeting = meetingService.getAllMeetingInfo();
        return Msg.success().add("meeting", meeting);
    }

    @GetMapping("editMeeting")
    public String getEditMeetingPage(){
        return "editMeeting";
    }

    @GetMapping("editMeetingById")
    @ResponseBody
    public Msg editMeetingById(){
        return Msg.success();
    }

    @PostMapping("/addMeetingInfo")
    @ResponseBody
    public Msg addMeetingInfo(
            @RequestParam("meeting_name") String meeting_name,
            @RequestParam("meeting_depart") String meeting_depart,
            @RequestParam("meeting_date") String meeting_date,
            @RequestParam("meeting_place") String meeting_place,
            @RequestParam("meeting_host") String meeting_host,
            @RequestParam("meeting_saver") String meeting_saver,
            @RequestParam("meeting_type") String meeting_type,
            @RequestParam("meeting_present") String meeting_present,
            @RequestParam("meeting_abstruct") String meeting_abstruct,
            @RequestParam("meeting_remark") String meeting_remark,
            @RequestParam("meeting_content") String meeting_content,
            @RequestParam("meeting_isopen") String meeting_isopen
            ){
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = null;
        try {
            date1 = format.parse(meeting_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        MeetingInfo record = new MeetingInfo(null,meeting_name,Integer.parseInt(meeting_depart),
                meeting_place,date1,meeting_host,meeting_present,
                meeting_saver,meeting_abstruct,meeting_remark,Integer.parseInt(meeting_type),
                meeting_content,Integer.parseInt(meeting_isopen));
        int test = meetingService.addMeetingInfo(record);
        System.out.println(test);
        if(test!=0){
            return Msg.success();
        }else {
            return Msg.fail();
        }

    }
}

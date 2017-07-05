package com.ronyao.controller;

import com.ronyao.bean.MeetingType;
import com.ronyao.bean.Msg;
import com.ronyao.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by DELL on 17.7.5.
 */
@Controller
public class TypeController {

    @Autowired
    TypeService typeService;

    @GetMapping("getTypeForSelect")
    @ResponseBody
    public Msg getAllType(){
        List<MeetingType> type = typeService.getAllType();
        return Msg.success().add("type",type);
    }
}

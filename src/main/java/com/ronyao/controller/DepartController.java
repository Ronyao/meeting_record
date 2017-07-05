package com.ronyao.controller;

import com.ronyao.bean.Department;
import com.ronyao.bean.Msg;
import com.ronyao.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by DELL on 17.7.5.
 */
@Controller
public class DepartController {
    @Autowired
    DepartService departService;

    @GetMapping("/getDepartForSelect")
    @ResponseBody
    public Msg getDepartForSelect(){
        List<Department> depart = departService.getAllDepart();
        return Msg.success().add("depart", depart);
    }
}

package com.ronyao.service;

import com.ronyao.bean.Department;
import com.ronyao.dao.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 17.7.5.
 */
@Service
public class DepartService {
    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getAllDepart(){
        return departmentMapper.getAllDepart();
    }
}

package com.lyzd.client.controller;

import com.lyzd.client.service.DeptService;
import com.lyzd.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    DeptService deptService;

    @RequestMapping("/getAll")
    public List<Dept> getAll(){
        return deptService.getAll();
    }
}

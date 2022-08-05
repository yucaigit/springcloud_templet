package com.lyzd.fegin.controller;

import com.lyzd.entity.Dept;
import com.lyzd.fegin.service.DeptFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignController {
    @Autowired
    DeptFeginService deptFeginService;

    @RequestMapping("/fegin")
    public List<Dept> getAll(){return deptFeginService.getAll();}
}

package com.lyzd.client.service.impl;

import com.lyzd.client.mapper.DeptMapper;
import com.lyzd.client.service.DeptService;
import com.lyzd.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    DeptMapper deptMapper;

    @Override
    public List<Dept> getAll() {
        return deptMapper.getAll();
    }
}

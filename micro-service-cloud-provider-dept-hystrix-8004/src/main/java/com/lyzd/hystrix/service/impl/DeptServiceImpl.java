package com.lyzd.hystrix.service.impl;

import com.lyzd.hystrix.service.DeptService;
import org.springframework.stereotype.Service;

@Service("deptService")
public class DeptServiceImpl implements DeptService {
    @Override
    public String dept_infok(Integer id) {
        return null;
    }

    @Override
    public String dept_fail(Integer id) {
        return null;
    }
}

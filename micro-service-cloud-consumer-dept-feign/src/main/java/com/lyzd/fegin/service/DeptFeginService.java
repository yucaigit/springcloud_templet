package com.lyzd.fegin.service;

import com.lyzd.entity.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(value = "microServiceCloudProviderDept")
public interface DeptFeginService {
    //对应服务提供者（8001)
    @RequestMapping("/getAll")
    public List<Dept> getAll();
}

package com.lyzd.hystrix.service;

public interface DeptService {
    // hystrix 熔断器示例 ok
    public String dept_infok(Integer id);

    //hystrix 熔断器超时案例
    public String dept_fail(Integer id);

}

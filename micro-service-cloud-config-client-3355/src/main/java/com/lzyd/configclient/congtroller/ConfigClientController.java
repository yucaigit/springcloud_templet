package com.lzyd.configclient.congtroller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope //为了让动态（手动）的获取最新的git 配置，在添加 actuator 监控加载 RefreshScope，
@RestController

public class ConfigClientController {

    @Value("${server.port}")
    private String serverPort;
    @Value("${config.info}")
    private String configInfo;


    @Value("${config.version}")
    private String configVersion;

    @GetMapping(value = "/getConfig")
    public String getConfig() {
        return "info：" + configInfo + "<br/>version：" + configVersion + "<br/>port：" + serverPort;
    }
}

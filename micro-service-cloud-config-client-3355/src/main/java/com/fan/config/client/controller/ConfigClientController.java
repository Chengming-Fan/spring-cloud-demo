package com.fan.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Chengming Fan on 2023/5/22 09:46
 */
@RestController
@RefreshScope // 开启刷新配置
public class ConfigClientController {

    @Value("${server.port}")
    private String port;

    @Value("${config.info}")
    private String configInfo;

    @Value("${config.version}")
    private String configVersion;

    @GetMapping("/get-config")
    public String getConfig() {
        return "info: " + configInfo + "<br />version: " + configVersion + "<br />port: " + port;
    }
}

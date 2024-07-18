package pers.example.nacos.cloudType.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.example.nacos.cloudType.config.CloudTypeProperties;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */

@Slf4j
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    private CloudTypeProperties cloudTypeProperties;

    @GetMapping("/getValue")
    public String getValue() {
        log.info("getValue, age:{}, sex:{}", cloudTypeProperties.getAge(), cloudTypeProperties.getSex());
        return "success";
    }

}

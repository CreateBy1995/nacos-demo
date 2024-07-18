package pers.example.nacos.nacosType.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.example.nacos.nacosType.config.PropertiesType;
import pers.example.nacos.nacosType.config.SourceType;

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
    private PropertiesType propertiesType;
    @Autowired
    private SourceType sourceType;
    @GetMapping("/getValue")
    public String getValue(){
        log.info("getValue, properties age:{}, sex:{}", propertiesType.getAge(), propertiesType.getSex());
        log.info("getValue, source age:{}, sex:{}", sourceType.getAge(), sourceType.getSex());
        return "success";
    }

}

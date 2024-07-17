package pers.example.nacos.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.example.nacos.common.ICustomMockFacade;
import pers.example.nacos.common.IGlobalMockFacade;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */

@Slf4j
@RestController
@RequestMapping("/config")
public class ConfigController {
    @GetMapping("/getValue")
    public String getValue(){
        log.info("config controller execute getValue");
        return "get value";
    }

}

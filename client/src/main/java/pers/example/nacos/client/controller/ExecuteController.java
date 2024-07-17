package pers.example.nacos.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.example.nacos.common.IProductFacade;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */

@Slf4j
@RestController
@RequestMapping("/execute")
public class ExecuteController {
    @Autowired
    private IProductFacade productFacade;
    @GetMapping("/test")
    public String test(){
        log.info("client execute test");
        return productFacade.test();
    }
}

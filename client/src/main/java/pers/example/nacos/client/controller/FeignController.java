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
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private ICustomMockFacade customMockFacade;
    @Autowired
    private IGlobalMockFacade globalMockFacade;
    @GetMapping("/global/timeout")
    public String globalTimeout(){
        log.info("feign client execute globalTimeout");
        return globalMockFacade.timeout(3500);
    }


    @GetMapping("/custom/timeout")
    public String customTimeout(){
        log.info("feign client execute customTimeout");
        return customMockFacade.timeout(3500);
    }

    @GetMapping("/global/normal")
    public String globalNormal(){
        log.info("feign client execute globalNormal");
        return globalMockFacade.normal();
    }
}

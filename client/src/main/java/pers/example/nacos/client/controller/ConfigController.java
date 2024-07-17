package pers.example.nacos.client.controller;

import com.alibaba.nacos.client.utils.JSONUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.example.nacos.client.config.ClientProperties;
import pers.example.nacos.common.ICustomMockFacade;
import pers.example.nacos.common.IGlobalMockFacade;

import java.io.IOException;

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
    private ClientProperties clientProperties;
    @GetMapping("/getValue")
    public String getValue(){
        log.info("getValue, properties:{}", clientProperties.getConnectTimeout());
        return "success";
    }

}

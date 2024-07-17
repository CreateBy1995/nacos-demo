package pers.example.nacos.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.example.nacos.common.ICustomMockFacade;
import pers.example.nacos.common.IGlobalMockFacade;

import java.util.concurrent.TimeUnit;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */

@Slf4j
@RestController
@RequestMapping("/custom")
public class CustomController implements ICustomMockFacade {


    @Override
    public String timeout(Integer milliseconds) {
        log.info("custom controller execute timeout");
        if (milliseconds > 0) {
            try {
                TimeUnit.MILLISECONDS.sleep(milliseconds);
            } catch (InterruptedException e) {
                // ignore
            }
        }
        return "sleep:" + milliseconds;
    }
}

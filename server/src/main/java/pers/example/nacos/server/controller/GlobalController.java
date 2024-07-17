package pers.example.nacos.server.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.example.nacos.common.IGlobalMockFacade;

import java.util.concurrent.TimeUnit;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */

@Slf4j
@RestController
@RequestMapping("/global")
public class GlobalController implements IGlobalMockFacade {

    @Override
    public String normal() {
        log.info("global controller execute normal");
        return "global normal";
    }

    @Override
    public String timeout(Integer milliseconds) {
        log.info("global controller execute timeout");
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

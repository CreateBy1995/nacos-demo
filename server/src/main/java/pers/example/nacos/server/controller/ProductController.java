package pers.example.nacos.server.controller;

import lombok.extern.slf4j.Slf4j;
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
@RequestMapping("/product")
public class ProductController implements IProductFacade {
    @Override
    public String test() {
        log.info("execute product test");
        return "product test";
    }
}

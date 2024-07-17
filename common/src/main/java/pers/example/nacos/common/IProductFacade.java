package pers.example.nacos.common;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */
@FeignClient(value = "nacos-demo-server", path = "/product")
public interface IProductFacade {
    @GetMapping("/test")
    String test();
}

package pers.example.nacos.common;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */


// value 服务名称, 单个服务多Feign接口的情况下需要用contextId区别开来。
@FeignClient(value = "nacos-demo-server", contextId = "global-mock", path = "/global")
public interface IGlobalMockFacade {

    @GetMapping("/normal")
    String normal();
    @GetMapping("/timeout")
    String timeout(@RequestParam Integer milliseconds);
}

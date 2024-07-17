package pers.example.nacos.common;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */
@FeignClient(value = "nacos-demo-server", contextId = "custom-mock", path = "/custom")
public interface ICustomMockFacade {
    @GetMapping("/timeout")
    String timeout(@RequestParam Integer milliseconds);
}

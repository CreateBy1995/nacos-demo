package pers.example.nacos.client;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */

@EnableFeignClients(basePackages = {"pers.example.nacos.common"})
@SpringBootApplication
@NacosConfigurationProperties(groupId = "NACOS-TEST-GROUP",dataId = "NACOS-TEST-DATA-ID",autoRefreshed = true)
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class);
    }
}

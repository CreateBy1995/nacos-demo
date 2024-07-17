package pers.example.nacos.client;

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
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class);
    }
}

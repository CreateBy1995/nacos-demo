package pers.example.nacos.cloudType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */

@SpringBootApplication
@EnableConfigurationProperties
public class Starter {
    public static void main(String[] args) {
        SpringApplication.run(Starter.class);
    }
}

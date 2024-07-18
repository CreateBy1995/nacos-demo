package pers.example.nacos.cloudType.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */


@Slf4j
@Data
@Component
// 使用该注解后 创建的实例不是单例模式 即每次配置发生变更 该实例都会被重新创建。
// 也就是热更新的实现原理。
@RefreshScope
@ConfigurationProperties(prefix = "cloud-type")
public class CloudTypeProperties {
    public CloudTypeProperties(){
        log.info("client construct init");
    }
    private Integer age;
    private Integer sex;
}

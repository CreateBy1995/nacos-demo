package pers.example.nacos.client.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
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
//@NacosConfigurationProperties()
@ConfigurationProperties(prefix = "client")
public class ClientProperties {
    public ClientProperties(){
        log.info("client construct init");
    }
    private Integer readTimeout;
    private Integer connectTimeout;
}

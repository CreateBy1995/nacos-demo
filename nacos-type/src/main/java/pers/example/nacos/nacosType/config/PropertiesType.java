package pers.example.nacos.nacosType.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigurationProperties;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @Author: dongcx
 * @CreateTime: 2024-07-17
 * @Description:
 */


@Slf4j
@Data
@Component
@NacosConfigurationProperties(dataId = "properties-type", prefix = "pt", autoRefreshed = true)
public class PropertiesType {
    public PropertiesType(){
        log.info("properties type construct init");
    }
    private Integer age;
    private Integer sex;
}

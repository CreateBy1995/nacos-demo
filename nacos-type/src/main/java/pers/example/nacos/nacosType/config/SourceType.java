package pers.example.nacos.nacosType.config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
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
@NacosPropertySource(dataId = "source-type", autoRefreshed = true)
public class SourceType {
    @NacosValue(value = "${age}")
    private Integer age;
    @NacosValue(value = "${sex}", autoRefreshed = true)
    private Integer sex;
}

package com.demo.mdubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

/**
 * @version : V1.0
 * @ClassName: DubboProviderApplication
 * @Description TODO
 * @Auther: WUWEIGUANG
 * @Date: 2019/4/2214:13
 */
@EnableDubbo
@SpringBootApplication
@PropertySource("classpath:config.properties")
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}

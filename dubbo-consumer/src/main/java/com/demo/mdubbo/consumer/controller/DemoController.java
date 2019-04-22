package com.demo.mdubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.mdubbo.api.service.DemoService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version : V1.0
 * @ClassName: DemoController
 * @Description TODO
 * @Auther: WUWEIGUANG
 * @Date: 2019/4/2211:52
 */
@RestController
public class DemoController {

    @Reference(version = "${demo.service.version}")
    private DemoService demoService;

    @RequestMapping("sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return demoService.sayHello("张三");
    }
}

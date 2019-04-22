package com.demo.mdubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.mdubbo.api.service.DemoService;

/**
 * @version : V1.0
 * @ClassName: DemoServiceImpl
 * @Description TODO
 * @Auther: WUWEIGUANG
 * @Date: 2019/4/2214:19
 */
@Service(version = "${demo.service.version}")
public class DemoServiceImpl implements DemoService {


    @Override
    public String sayHello(String name) {
        return "Hello" + name + "Dubbo Test";
    }
}

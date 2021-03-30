package com.example.hello.dubbo.service.user.provider.apimpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hello.dubbo.service.user.api.UserService;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {
//    @Override
//    public String sayHi() {
//        return "Hello Dubbo";
//    }

    @Value("${dubbo.protocol.port}")
    private String port;

    @Override
    public String sayHi() {
        return "Hello Dubbo , i am from port:" + port;
    }
}

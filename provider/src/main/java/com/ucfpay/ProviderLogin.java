package com.ucfpay;


import com.ucfpay.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2016/6/30.
 */

@RestController
@Service
public class ProviderLogin {

    @Autowired
    LoginService loginService;

    @RequestMapping("/login1")
    public String loginSSSSSSSSS(){
        return loginService.login();
    }
}

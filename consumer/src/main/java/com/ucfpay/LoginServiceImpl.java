package com.ucfpay;

import com.ucfpay.config.MQBean;
import com.ucfpay.config.annotation.Remote;
import com.ucfpay.config.annotation.Sink;
import com.ucfpay.config.annotation.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * Created by lenovo on 2016/6/30.
 */


@MQBean
public class LoginServiceImpl implements LoginService {

    @Source
    public String login(){
        return "welcome dubbo";
    }


    @Sink
    public String logout(String msg){
        System.out.printf("logout=="+msg);
        return "OK";
    }


    public LoginServiceImpl LoginService(){
        return new LoginServiceImpl();
    }

}

package com.ucfpay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;


@SpringBootApplication
@RestController
public class ConsumerApplication {


	@Resource(name="loginServiceImpl")
	LoginService loginService;

	@RequestMapping("/login2")
	public String lllll(){
		return  loginService.login();
	}

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}

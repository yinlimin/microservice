package com.ucfpay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.ReflectionUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConsumerApplication.class)
public class ConsumerApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println(ReflectionUtils.findField(String.class,"hash")) ;
	}

}

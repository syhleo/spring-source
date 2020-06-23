package com.tuling.testbfpostprocessor;

import com.tuling.testconfiuration.compent.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by smlz on 2019/5/26.
 */
@Configuration
@ComponentScan(basePackages = "com.tuling.testbfpostprocessor")
public class MainConfig {

	@Bean
	public com.tuling.testconfiuration.compent.Person person(){
		return new Person();
	}

}

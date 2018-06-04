package com.wuzhenbao.msdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.wuzhenbao.msdp.common","com.wuzhenbao.msdp.controller"})
public class MsdpMain {

	public static void main(String[] args) {
		SpringApplication.run(MsdpMain.class, args);
	}
}

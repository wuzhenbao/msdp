package com.wuzhenbao.msdp.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.wuzhenbao.msdp.user.api.service.MsdpUserService;

@Configuration  
//@PropertySource("classpath:dubbo/dubbo.properties")  
//@ImportResource({ "classpath:dubbo/*.xml" }) 
public class DubboConfig {
	
	 @Bean
	    public ApplicationConfig applicationConfig() {
	        ApplicationConfig applicationConfig = new ApplicationConfig();
	        applicationConfig.setName("msdp.web");
	        return applicationConfig;
	    }

	    @Bean
	    public ConsumerConfig consumerConfig() {
	        ConsumerConfig consumerConfig = new ConsumerConfig();
	        consumerConfig.setTimeout(3000);
	        return consumerConfig;
	    }

	    @Bean
	    public RegistryConfig registryConfig() {
	        RegistryConfig registryConfig = new RegistryConfig();
	        registryConfig.setAddress("zookeeper://192.168.1.122:2181");
	        registryConfig.setClient("curator");
	        return registryConfig;
	    }
}

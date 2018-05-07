package com.mybitauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*@EnableEurekaClient 这个注解只用于Eureka做为服务发现组件，
@EnableDiscoveryClient 则可用于所有的服务发现组件 （包括ZK、Consul等）
@Configuration
*/
@ComponentScan
@EnableEurekaClient
@RestController
@SpringBootApplication
public class ProviderApplication {

	@RequestMapping("/hello")
	public String home() {
		return "Hello world 8899";
	}

	public static void main(String[] args) {
		new SpringApplicationBuilder(ProviderApplication.class).web(true).run(args);
	}

}

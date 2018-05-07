package com.mybitauto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/*@EnableEurekaClient 这个注解只用于Eureka做为服务发现组件，
@EnableDiscoveryClient 则可用于所有的服务发现组件 （包括ZK、Consul等）
@Configuration
*/
//启用Feign模拟WebService客户端
//@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class FeignProviderApplication02 {

	public static void main(String[] args) {
		//new SpringApplicationBuilder(FeignProviderApplication.class).web(true).run(args);
		SpringApplication.run(FeignProviderApplication02.class, args);
	}

}

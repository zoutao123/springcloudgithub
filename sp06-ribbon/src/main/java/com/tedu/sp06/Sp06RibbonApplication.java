package com.tedu.sp06;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@SpringBootApplication
public class Sp06RibbonApplication {

	//创建 RestTemplate 实例，并存入 spring 容器
	@LoadBalanced//对restTemplate进行aop代码切入，生成aop动态代理对象
	@Bean
	public RestTemplate getRestTemplate() {
		SimpleClientHttpRequestFactory f = new SimpleClientHttpRequestFactory();
		f.setConnectTimeout(1000);
		f.setReadTimeout(1000);
		//restemplate 中默认的factory实例中，两个超时属性默认值为-1
		//未启用超时，不会触发重试
		return new RestTemplate(f);
	}

	public static void main(String[] args) {
		SpringApplication.run(Sp06RibbonApplication.class, args);
	}

}
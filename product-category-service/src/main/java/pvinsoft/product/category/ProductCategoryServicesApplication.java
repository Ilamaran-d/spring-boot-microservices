package pvinsoft.product.category;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
@EnableEurekaClient
public class ProductCategoryServicesApplication {
	
	@Bean 
	@LoadBalanced
	public WebClient.Builder loadBalancedWebClientBuilder() {
		return WebClient.builder();
	}
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
	
	/*
	 * public WebClient getWebClientBuilder(WebClient.Builder webClientBuilder) {
	 * return webClientBuilder.baseUrl("http://localhost:8000").build(); }
	 */
	public static void main(String[] args) {
		SpringApplication.run(ProductCategoryServicesApplication.class, args);
	}
}

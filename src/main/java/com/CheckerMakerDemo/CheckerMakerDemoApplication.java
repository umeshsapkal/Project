package com.CheckerMakerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger.web.UiConfigurationBuilder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
@Configuration
public class CheckerMakerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckerMakerDemoApplication.class, args);
	}

	
	  @Bean public Docket beerMapApi() { return new
	  Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any
	  ()).build() .pathMapping("/").apiInfo(apiInfo()); }
	  
	  @Bean public UiConfiguration uiConfig() { return
	  UiConfigurationBuilder.builder().build(); }
	  
	  private ApiInfo apiInfo() { return new
	  ApiInfoBuilder().title("title").description("description").version("0.1").
	  build(); }
	

}

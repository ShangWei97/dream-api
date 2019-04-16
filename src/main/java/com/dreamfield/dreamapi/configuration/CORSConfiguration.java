package com.dreamfield.dreamapi.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * @author: shangwei
 * @date: 2019-03-31 16:44
 */

@Configuration
public class CORSConfiguration{

    @Bean
    public WebMvcConfigurer corsConfigurer() {
    	return new WebMvcConfigurer() {
    		@Override
		    public void addCorsMappings(CorsRegistry registry) {
			    //设置访问的IP和端口，此代表所有都可以访问
    			registry.addMapping("/**")
					    .allowCredentials(true);//设置成允许操作cookie
    		}
		};
	}

}


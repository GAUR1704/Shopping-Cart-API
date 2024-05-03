package com.prowings.shopping_cart_app.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerBeanMapperConfig {
	
	@Bean
	public DozerBeanMapper dozerBeanMapper() {
	
		DozerBeanMapper mapper = new DozerBeanMapper();
//		mapper.setMappingFiles(Arrays.asList("dozer_mapping.xml"));
		return mapper;
	}

}

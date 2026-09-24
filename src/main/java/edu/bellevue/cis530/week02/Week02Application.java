package edu.bellevue.cis530.week02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import edu.bellevue.cis530.week02.model.ApiInfoBean;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week02Application {

	public static void main(String[] args) {
		SpringApplication.run(Week02Application.class, args);
	}

	@Bean
	CommandLineRunner prototypeDemo(ObjectProvider<ApiInfoBean> provider, ApplicationContext context) {
		return args -> {
			ApiInfoBean first = provider.getObject();
			ApiInfoBean second = provider.getObject();

			context.getAutowireCapableBeanFactory().destroyBean(first);
			context.getAutowireCapableBeanFactory().destroyBean(second);
		};
	}
}

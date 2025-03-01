package com.demo.springconcepts;
import com.demo.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ComponentScan(basePackages = "com.demo.component")
@SpringBootApplication
public class SpringConceptsApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to My Spring Concept Demo");
		ApplicationContext context=SpringApplication.run(SpringConceptsApplication.class, args);
		System.out.println("Checking Context:"+context.getBean(DemoBean.class));

		logger.debug("Checking Context: {}",context.getBean (DemoBean.class));
		logger.debug("\n*** Logging at debug level ***");

	}

}





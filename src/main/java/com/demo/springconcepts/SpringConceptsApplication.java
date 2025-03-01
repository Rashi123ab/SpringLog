package com.demo.springconcepts;
import com.demo.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.demo.component")//UC1
@SpringBootApplication
public class SpringConceptsApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Spring Concept Demo");
		ApplicationContext context=SpringApplication.run(SpringConceptsApplication.class, args);
		System.out.println("Checking Context:"+context.getBean(DemoBean.class));
	}

}

package com.springcorejavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.springcorejavaconfig")
public class javaConfig {
	@Bean
	public  Samosa getSamosa() {
		return new Samosa();
			
	}
	
	
	@Bean
	public Student getStudent() {
	Student st=new Student(getSamosa());
	return st;

}}

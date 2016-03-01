package com.luke.oldspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luke.pojo.User;

public class OldSpringLoadAppContext {
	private String name;
	
	private String password;
	
	private User userPojo;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	// π”√ClassPathXmlApplicationContext
	public static void loadAppContext(){
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[]{"config.xml"}
				);
		OldSpringLoadAppContext oslac = context.getBean("oldSpring", OldSpringLoadAppContext.class);
		System.out.println(oslac.getName());
		System.out.println(oslac.getPassword());
		System.out.println(oslac.getUserPojo().getUserName());
	}
	
	
	public static void main(String[] args) {
		OldSpringLoadAppContext.loadAppContext();
	}


	public User getUserPojo() {
		return userPojo;
	}


	public void setUserPojo(User user) {
		this.userPojo = user;
	}
}

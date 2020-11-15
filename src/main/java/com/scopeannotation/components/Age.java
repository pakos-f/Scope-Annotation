package com.scopeannotation.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@SessionScope
@Component
public class Age {
	
	private String age = "24";

	public Age() {
		System.out.println("Create new Age: " + this.age);
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
}

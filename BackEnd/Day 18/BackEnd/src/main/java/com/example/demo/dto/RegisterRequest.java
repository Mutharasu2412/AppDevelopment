package com.example.demo.dto;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class RegisterRequest {
	private String email;
	private String password;
	private String role;
	private String name;
	public String getEmail() {
		
		return null;
	}
	public CharSequence getPassword() {
		
		return null;
	}
	public String getRole() {
		
		return null;
	}
}

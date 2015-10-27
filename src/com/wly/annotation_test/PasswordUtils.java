package com.wly.annotation_test;

public class PasswordUtils{
	@UseCase(id = 47, description = "bbbbbbbbbbbbbbbbbbbb")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w*"));
	}
	
	@UseCase(id = 48,description = "aaaaaaaaaaaaaaaaaaaaaaaa")
	public String encryptPassword(String password){
		 return new StringBuilder(password).reverse().toString();
	}
	
	public static void main(String[] args) {
		PasswordUtils utils = new PasswordUtils();
		boolean r = utils.validatePassword("");
		System.out.println(r);
	}
}

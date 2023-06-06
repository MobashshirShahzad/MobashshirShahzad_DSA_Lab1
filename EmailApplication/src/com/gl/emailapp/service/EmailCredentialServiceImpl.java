package com.gl.emailapp.service;

import com.gl.emailapp.model.Employee;

public class EmailCredentialServiceImpl implements EmailCredentialService{

	@Override
	public String generateEmailAddress(Employee emp, String department) {
	return emp.getFirstName().toLowerCase()+emp.getLastName().toLowerCase()+"@"+department+".gl.com";
	}
     
	@Override
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
  		String numbers = "0123456789";
  		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
  		
  		String values = capitalLetters + smallLetters + numbers + specialCharacters;
  		
Random random = new Random();
  		String password = "";
  		
  		for (int i=0;i<8;i++) {
  			password += values.charAt(random.nextInt(values.length()));
  		}
  		return password;
  		}

         @Override

          public void showCredentials(Employee employee,String department) {
		System.out.println("Dear" + employee.getFirstName() + "your generated credentials are as follows");
		System.out.println("your Password: " + generatePassword());
		System.out.println("Your Email:" + generateEmailAddress (employee, department));
		

 }
}

	

	 

	
	 


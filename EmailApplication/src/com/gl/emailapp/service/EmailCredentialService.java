package com.gl.emailapp.service;
import com.gl.emailapp.model.Employee;
public interface EmailCredentialService {
	
	public String generateEmailAddress(Employee emp, String department);
    
	public String generatePassword();
	
	public void showCredentials(Employee employee,String department);
	
}

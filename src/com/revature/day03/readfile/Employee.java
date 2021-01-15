package com.revature.day03.readfile;

public class Employee {
	private String employeeId;
	private String firstName;
	private String lastName;
	private String role;
	
	public Employee() {
		
	}
	
	public Employee(String employeeId, String firstName, String lastName, String role) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "[Employee ID: " + employeeId +  ", firstName: " + firstName + ", lastName: " + lastName + ", role: " + role + "]";
	}
	
	
}

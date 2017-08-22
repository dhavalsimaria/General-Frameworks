/**
 * 
 */
package com.dhaval.general;

/**
 * @author a611021
 *
 */
public class User {

	private String firstName;
	private String lastName;
	
	/** Parameterized Constructor */
	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	
}

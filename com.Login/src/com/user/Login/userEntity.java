package com.user.Login;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class userEntity {
	@Id 
		private int user_id;
	private String user_type;
	private String Firstname;
	private String Lastname;
	private String Emailadress;
	private String username;
	private String password;
	public userEntity(int user_id, String user_type, String firstname, String lastname, String emailadress,
			String username, String password) {
		super();
		this.user_id = user_id;
		this.user_type = user_type;
		Firstname = firstname;
		Lastname = lastname;
		Emailadress = emailadress;
		this.username = username;
		this.password = password;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getEmailadress() {
		return Emailadress;
	}
	public void setEmailadress(String emailadress) {
		Emailadress = emailadress;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "userEntity [user_id=" + user_id + ", user_type=" + user_type + ", Firstname=" + Firstname
				+ ", Lastname=" + Lastname + ", Emailadress=" + Emailadress + ", username=" + username + ", password="
				+ password + "]";
	}
	
	

}

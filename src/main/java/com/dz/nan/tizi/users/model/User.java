package com.dz.nan.tizi.users.model;

import java.util.HashSet;
import java.util.Set;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Ignore;
import com.googlecode.objectify.annotation.Index;

/**
 * 
 * @author LYES KHERBICHE
 * 
 */
@Entity
public class User {
	@Id
	@Index
	private String email;
	private String password;
	private boolean enabled;
	@Ignore
	private Set<UserRole> userRole = new HashSet<UserRole>(0);

	@SuppressWarnings("unused")
	private User() {
	}

	public User(String email, String password, boolean enabled) {
		super();
		this.email = email;
		this.password = password;
		this.enabled = enabled;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<UserRole> getUserRole() {
		return userRole;
	}

	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

}

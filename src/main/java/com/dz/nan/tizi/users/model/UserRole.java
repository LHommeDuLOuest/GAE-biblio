package com.dz.nan.tizi.users.model;

import com.googlecode.objectify.Ref;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Ignore;
import com.googlecode.objectify.annotation.Load;
import com.googlecode.objectify.annotation.Parent;

/**
 * 
 * @author LYES KHERBICHE
 *
 */
@Entity
public class UserRole {
	@Id
	private Long userRoleId;
	private String role;
	@Parent 
	@Load
	private Ref<User> refUser;
	@Ignore
	private User user;
	
	@SuppressWarnings("unused")
	private UserRole() {}
	
	public UserRole(String role, User user) {
		super();
		this.role = role;
		this.user = user;
	}
	
	public UserRole(String role) {
		super();
		this.role = role;
	}

	public Long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Ref<User> getRefUser() {
		return refUser;
	}

	public void setRefUser(Ref<User> refUser) {
		this.refUser = refUser;
	}
}

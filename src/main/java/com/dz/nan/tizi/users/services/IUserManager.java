package com.dz.nan.tizi.users.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.dz.nan.tizi.users.model.User;

/**
 * 
 * @author LYES
 * 
 */
public interface IUserManager extends UserDetailsService{
	void addUser(User user);
	}

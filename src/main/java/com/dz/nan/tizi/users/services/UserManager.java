package com.dz.nan.tizi.users.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dz.nan.tizi.data.IDao;
import com.dz.nan.tizi.users.model.UserRole;

/**
 * 
 * @author LYES KHERBICHE
 * 
 */
@Service
public class UserManager implements IUserManager {
	@Autowired
	private IDao userDao;
	@Autowired
	private IDao userRoleDao;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		com.dz.nan.tizi.users.model.User user = new com.dz.nan.tizi.users.model.User(
				username, null, false);
		UserRole userRole = new UserRole(null, user);
		List<UserRole> listUserRole = userRoleDao.find(userRole);
		user = listUserRole.get(0).getRefUser().get();
		Set<UserRole> setUserRole = new HashSet<UserRole>();
		setUserRole.addAll(listUserRole);
		user.setUserRole(setUserRole);
		List<GrantedAuthority> authority = buildUserAuthority(user
				.getUserRole());
		return buildUserForAuthentication(user, authority);
	}

	private User buildUserForAuthentication(
			com.dz.nan.tizi.users.model.User user,
			List<GrantedAuthority> authorities) {
		return new User(user.getEmail(), user.getPassword(), user.isEnabled(),
				true, true, true, authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(Set<UserRole> userRoles) {
		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();
		for (UserRole userRole : userRoles) {
			setAuths.add(new SimpleGrantedAuthority(userRole.getRole()));
		}
		List<GrantedAuthority> result = new ArrayList<GrantedAuthority>(
				setAuths);
		return result;
	}

	@Override
	public void addUser(com.dz.nan.tizi.users.model.User user) {
		UserRole userRole = new UserRole("ROLE_USER");
		Set<UserRole> setUserRole = new HashSet<UserRole>();
		setUserRole.add(userRole);

		userRole.setUser(user);
		user.setUserRole(setUserRole);

		this.userDao.save(user);
		this.userRoleDao.save(userRole);
	}
}

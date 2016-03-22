package com.dz.nan.tizi.users.dao;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.dz.nan.tizi.data.IDao;
import com.dz.nan.tizi.users.model.User;
import com.dz.nan.tizi.users.model.UserRole;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Ref;

/**
 * 
 * @author LYES Kherbiche
 * 
 */
public class UserRoleDao implements IDao<UserRole> {
	static {
		ObjectifyService.register(User.class);
		ObjectifyService.register(UserRole.class);
		addCredential();
	}

	private static void addCredential() {
		User user = new User("lyes@yahoo.fr", "lyes", true);
		UserRole userRole1 = new UserRole("ROLE_USER");
		UserRole userRole2 = new UserRole("ROLE_ADMIN");

		Set<UserRole> setUserRole = new HashSet<UserRole>(0);
		setUserRole.add(userRole1);
		setUserRole.add(userRole2);

		user.setUserRole(setUserRole);

		userRole1.setRefUser(Ref.create(user));
		userRole1.setUser(user);
		userRole2.setRefUser(Ref.create(user));
		userRole2.setUser(user);

		ofy().save().entity(user).now();
		ofy().save().entity(userRole1).now();
		ofy().save().entity(userRole2).now();
	}

	@Override
	public List<UserRole> find(UserRole userRole) {
		List<UserRole> listUserRole = new ArrayList<UserRole>();
		listUserRole = ofy().load().type(UserRole.class)
				.ancestor(userRole.getUser()).list();
		return listUserRole;
	}

	@Override
	public void save(UserRole userRole) {
		userRole.setRefUser(Ref.create(userRole.getUser()));
		ofy().save().entity(userRole).now();
	}

}

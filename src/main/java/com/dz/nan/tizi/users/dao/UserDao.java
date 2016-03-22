package com.dz.nan.tizi.users.dao;

import java.util.List;
import com.dz.nan.tizi.data.IDao;
import com.dz.nan.tizi.users.model.User;
import static com.googlecode.objectify.ObjectifyService.ofy;

/**
 * 
 * @author LYES KHERBICHE
 *
 */
public class UserDao implements IDao<User>{

	/*
	 * @Override
	public User find(User obj) {
		Key cleUser = KeyFactory.createKey("User", "lyes");
		Key cleUserRole = KeyFactory.createKey(cleUser, "UserRole", "pourlyes");
		try {
			Entity userTrouve = datastore.get(cleUser);
			Entity userRoleTrouve = datastore.get(cleUserRole);
			obj.setEmail((String)userTrouve.getProperty("email"));
			obj.setPassword((String) userTrouve.getProperty("password"));
			obj.setEnabled((Boolean) userTrouve.getProperty("enabled"));
			UserRole userRole = new UserRole(null,(String)userRoleTrouve.getProperty("role"));
			Set<UserRole> setUserRole = new HashSet<UserRole>(0);
			setUserRole.add(userRole);
			obj.setUserRole(setUserRole);
		} catch (EntityNotFoundException e) {
			e.printStackTrace();
		}
		return obj;
	}*
	*/
	
	/*
	 * 
	private static void addCredential(){	
		Entity user = new Entity("User", "lyes");
		user.setProperty("email", "lyes@gmail.com");
		user.setProperty("password", "kherbiche");
		user.setProperty("enabled", true);
		Entity userRole = new Entity("UserRole", "pourlyes", user.getKey());
		userRole.setProperty("role", "ROLE_USER");
		datastore.put(user);
		datastore.put(userRole);
	}
	*/
	/*
	private static void addCredential(){
		User user = new User("lyes@yahoo.fr","lyes",true);
		UserRole userRole = new UserRole("ROLE_USER");
		Set<UserRole> setUserRole = new HashSet<UserRole>(0);
		setUserRole.add(userRole);
		user.setUserRole(setUserRole);
		//userRole.setRefUser(Ref.create(KeyFactory.createKey("User", "lyes@yahoo.fr")));
		//userRole.setRefUser(Ref.create(key<user>));
		userRole.setRefUser(Ref.create(user));
		userRole.setUser(user);
		ofy().save().entity(user).now();
		ofy().save().entity(userRole).now();
	} */

	/*@Override
	public List<User> find(User user) {
		
		//user = ofy().load().entity(user).now();
		//System.out.println("Just a test In UserDao.find(), after load, value of Set UserRole size is: " +user.getUserRole().size());
		//user.setUserRole( (Set<UserRole>) ofy().load().type(UserRole.class).parent(user));
		//Set<UserRole> userRole = new HashSet<UserRole>(0);
		//userRole = ofy().load().type(UserRole.class).parent(user);
		
		//TODO with Spring @Inject
		//UserRoleDao userRoleDao = new UserRoleDao();
		UserRole userRole = new UserRole(null,user);//
		//pb visibilité listUser dans la boucle
		//List<User> listUser = null;// this cause Null pointer exception in this instruction: listUser.add(user);
		List<User> listUser = new ArrayList<User>();
		
		System.out.println("In UserDao.find(), before load, value of user pwd is: " +user.getPassword());
		List<UserRole> list = userRoleDao.find(userRole);// @Refer the modify of UserManager
		user = null;
		System.out.println("In UserDao.find(), after load, value of returned list<UserRole> is: "+list.size());
		for(int i=0; i<list.size(); i++) {
			user = list.get(i).getRefUser().get();//
			System.out.println("In UserDao.find(), after load, value of user["+i+"] pwd is: " +user.getPassword());
			System.out.println("In UserDao.find(), after load, value of Set UserRole size is: " +user.getUserRole().size());
			listUser.add(user);
			System.out.println("In UserDao.find(), after load, value of listUser["+i+"].user.Email is: " +listUser.get(i).getEmail());
			System.out.println("In UserDao.find(), after load, value of listUser["+i+"].user.pwd is: " +listUser.get(i).getPassword());
		}
		System.out.println("In UserDao.find(), after load, value of listUser[0].user.pwd is: " +listUser.get(0).getPassword());
		return listUser;
	}*/
	/*
	@Override
	public List<User> find(User user) {
		        //user = ofy().load().entity(user).now();
				//System.out.println("Just a test In UserDao.find(), after load, value of Set UserRole size is: " +user.getUserRole().size());
				//user.setUserRole( (Set<UserRole>) ofy().load().type(UserRole.class).parent(user));
				//Set<UserRole> userRole = new HashSet<UserRole>(0);
				//userRole = ofy().load().type(UserRole.class).parent(user);
				
				//TODO with Spring @Inject
				//UserRoleDao userRoleDao = new UserRoleDao();
				
				//pb visibilité listUser dans la boucle
				//List<User> listUser = null;// this cause Null pointer exception in this instruction: listUser.add(user);
		
		        UserRole userRole = new UserRole(null,user);
				List<User> listUser = new ArrayList<User>();
				Set<UserRole> setUserRole = new HashSet<UserRole>();
				
				System.out.println("In UserDao.find(), before load, value of user pwd is: " +user.getPassword());
				List<UserRole> list = userRoleDao.find(userRole);// @Refer the modify of UserManager
				setUserRole.addAll(list);
				user = null;
				System.out.println("In UserDao.find(), after load, value of returned list<UserRole> is: "+list.size());
				for(int i=0; i<list.size(); i++) {
					user = list.get(i).getRefUser().get();//
					user.setUserRole(setUserRole);
					System.out.println("In UserDao.find(), after load, value of user["+i+"] pwd is: " +user.getPassword());
					System.out.println("In UserDao.find(), after load, value of Set UserRole in user size is: " +user.getUserRole().size());
					listUser.add(user);
					System.out.println("In UserDao.find(), after load, value of listUser["+i+"].user.Email is: " +listUser.get(i).getEmail());
					System.out.println("In UserDao.find(), after load, value of listUser["+i+"].user.pwd is: " +listUser.get(i).getPassword());
				}
				System.out.println("In UserDao.find(), after load, value of listUser[0].user.pwd is: " +listUser.get(0).getPassword());
				return listUser;
	}
	*/
	
	@Override
	public void save(User user) {
		//this.userRoleDao.save(user.getUserRole());
		ofy().save().entity(user).now();
	}

	@Override
	public List<User> find(User obj) {
		// TODO Auto-generated method stub
		return null;
	}
	

}

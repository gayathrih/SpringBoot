package com.app.ticketmanagement.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.ticketmanagement.model.User;

@Service
public class UserServiceImpl  implements UserService{
	
	List<User> users;
	
	public UserServiceImpl() {
		super();
      
		  users =  new LinkedList<User>();
		  
		  users.add( new User(1,"A","Mumbai"));
		  users.add(  new User(2,"B","Chennai"));
		  users.add( new User(3,"C","Hydra"));
		  users.add( new User(4,"D","Delhi"));
		  users.add(  new User(5,"E","Bnagalore"));
	
	}
	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return this.users;
	}
	
	@Override
	public User getById(Integer id) {
		
		return users.stream()
				   .filter( obj -> obj.getId() == id)
				   .findAny()
				   .orElse(new User(0 , "user name not Found", "Address Not Found" ));
	}
	
	@Override
	public void createUser(Integer id, String name, String address) {

		/*
		 * User obj = new User(id, name,address);
		 *  users.add(obj);
		 */
		
		  users.add(new User(id, name,address));
		  
		
	}
	@Override
	public void updateUser(Integer id, String name) {
		
		 users.stream()
		      .filter( (User obj) -> obj.getId() == id)
		      .findAny()
		      .orElseThrow(()-> new RuntimeException("UserNotFoundException"))
		      .setName(name);
		      
		
	}
	
	@Override
	public void updateUser( String address , Integer id) {
		
		 users.stream()
		      .filter( (User obj) -> obj.getId() == id)
		      .findAny()
		      .orElseThrow(()-> new RuntimeException("UserNotFoundException"))
		      .setAddress(address);
		      
		
	}
	@Override
	public void deleteUser(Integer id) {
		 users.removeIf((User obj) -> obj.getId() == id);
		
	}

}

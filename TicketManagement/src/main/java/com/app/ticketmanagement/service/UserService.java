package com.app.ticketmanagement.service;

import java.util.List;
import com.app.ticketmanagement.model.User;

public interface UserService {
	
	//Read all users
	
	   List<User> getAllUsers();
	   
	//read by id
	  User  getById(Integer id);
	  
	   void createUser(Integer id , String name, String address);
	   
	   void updateUser(Integer id, String name );
	   void updateUser(String address  , Integer id);
	  
	   void deleteUser(Integer id);
	   
	  

}

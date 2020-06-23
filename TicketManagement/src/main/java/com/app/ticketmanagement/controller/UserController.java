package com.app.ticketmanagement.controller;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.ticketmanagement.model.User;
import com.app.ticketmanagement.service.UserServiceImpl;

@RestController
@RequestMapping("/ticketapp-api")
public class UserController {
	
	@Autowired
	UserServiceImpl userServiceImpl;
	
	Map<String , String > map;
	
	@ResponseBody
	@RequestMapping("/getallusers")
	public List<User> getAllUsers(){
		
		return userServiceImpl.getAllUsers();
	}
	@ResponseBody
	@RequestMapping("/getuserbyid{id}")
	public User  getUserById(@PathVariable("id") Integer id) {
		
		 return userServiceImpl.getById(id);
	}
	
	
	@ResponseBody
	@RequestMapping(path="/createuser/{id}/{name}/{address}" , method = {RequestMethod.GET ,RequestMethod.POST})
	
	public  Map<String , String> createUser(@PathVariable Integer id,
											@PathVariable String name,
											@PathVariable String address)
	{
		userServiceImpl.createUser(id, name, address);
		
		map =  new LinkedHashMap<String, String>();
		
		map.put("result : ", "User added...!!!");
		
		return map;
		
	}
	
	/*
	 *  <form action="ticketapp-api/createuser">
	 *      ID : <input type="number" name="id"/>
	 *  
	 *  </form>
	 * @ResponseBody
	@RequestMapping(path="/createuser" , method = {RequestMethod.GET ,RequestMethod.POST})
	
	public  Map<String , String> createUser(@RequestParam(name="id") Integer id,
											@RequestParam(name="name") String name,
											@RequestParam(name="address") String address)
	{
		userServiceImpl.createUser(id, name, address);
		
		map =  new LinkedHashMap<String, String>();
		
		map.put("result : ", "User added...!!!");
		
		return map;
		
	}
	 * 
	 * */
	
	

	@ResponseBody
	@RequestMapping(path="/updatename/{id}/{name}" , method = {RequestMethod.GET ,RequestMethod.POST})
	
	public  Map<String , String> updateUserName(@PathVariable Integer id,
											@PathVariable String name
											)
	{
		userServiceImpl.updateUser(id, name);
		
		map =  new LinkedHashMap<String, String>();
		
		map.put("result : ", "User Updated...!!!");
		
		return map;
		
	}
	
	@ResponseBody
	@RequestMapping(path="/updateaddress/{address}/{id}" , method = {RequestMethod.GET ,RequestMethod.POST})
	
	public  Map<String , String> updateUserAdress(
											@PathVariable String address,
											@PathVariable Integer id
											)
	{
		userServiceImpl.updateUser(address, id);
		
		map =  new LinkedHashMap<String, String>();
		
		map.put("result : ", "User Updated...!!!");
		
		return map;
		
	}

	
	@ResponseBody
	@RequestMapping("/deleteuser{id}")
	public  Map<String , String> deleteUserById(@PathVariable("id") Integer id) {
		
		  userServiceImpl.deleteUser(id);
		  map =  new LinkedHashMap<String, String>();
			
			map.put("result : ", "user deleted...!!!");
			
			return map;
	}
	
}

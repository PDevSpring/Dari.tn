package com.dari.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dari.model.User;
import com.dari.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
    private UserRepository userRepository ; 
	
	@Override
	public void addAdmin(User user) {
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		user.setRole("Admin");
		userRepository.save(user); 
	}
	
	@Override
	public void addClient(User user) {
		user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
		user.setRole("Client");
		userRepository.save(user); 
	}
	
	@Override
	public List<User> getAllUsers() {
		List<User> users = (List<User>) userRepository.findAll();
		return users ; 
	}
	
	@Override
	public long getUserId(User user) {
		long id=0 ; 
		List<User> users =  getAllUsers() ;
		for (User user1:users) {
			if (user.getUserName().equals(user1.getUserName())) {
				id=user1.getId() ; 
			}
			
		}
		return id; 
	}
	
	@Override
	public String UserLogin(String userName , String password) {
		boolean state = false  ;
		String who = null ; 
		List<User> users =  getAllUsers() ;
		for(User user:users)
		{
			if (user.getUserName().equals(userName))
			{
			 state = new BCryptPasswordEncoder().matches(password, user.getPassword()) ; 
			 if (state == true ) { who = user.getRole() ; break ;} 
			 else return "Incorrect Password" ; 
			}
			else return "User Doen't Exist " ; 
		}
		
		
		return ("Hello" + who );    
	}
	
	@Override
	public String DeleteAccount(long id) {
		userRepository.deleteById(id);
		return "Deleted"; 
	}
	

}


package com.app.FoodApp.dto.Repo.Control.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.FoodApp.dto.User;

import com.app.FoodApp.dto.Repo.UserRepo;

@Repository
public class UserDao {
	@Autowired

	private UserRepo userrepo;

	public User insert(User user1) {
		return userrepo.save(user1);
	}
	
	public User save(User user2)
	{
		return userrepo.save(user2);
	}

	public User delete(int id) {
		User user1 = userrepo.findById(id).get();
		userrepo.delete(user1);
		return user1;
	}
	
	
	public User fetchbyid2(int id) {
		Optional<User> user1 = userrepo.findById(id);
		if(user1.isPresent())
		{
		
		return userrepo.findById(id).get();
		}
		else
		{	
			return null;
		}
	}
	
	public List<User> fetchall() {
		return userrepo.findAll();
	}

	

	
 
	public User update(int id, User user) {
		User user2 = userrepo.findById(id).get();
		if (user2 != null) {
			user.setUserId(id);
			return userrepo.save(user);
		} else {

			return null;
		}
	}
	
	public User updatetwo(User user)
	{
		User user22=userrepo.findById(user.getUserId()).get();
		if(user22!=null)
		{
			user.setUserAddress(user.getUserAddress());
			user.setUserPassword(user.getUserPassword());
			return userrepo.save(user22);
		}
		else
		{
			return null;
		}
		
	}
}

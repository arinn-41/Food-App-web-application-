package com.app.FoodApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.FoodApp.dto.User;
import com.app.FoodApp.dto.Repo.Control.Dao.UserDao;
import com.app.FoodApp.service.util.ResponseStructure;
import com.app.FoodApp.service.util.Exception.UserIdNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	public User save(User user) {
		return userDao.save(user);
	}

	public ResponseStructure<User> insert(User user1) {
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("Successfully Inserted");
		responseStructure.setData(userDao.insert(user1));

		return responseStructure;

	}

	public ResponseEntity<ResponseStructure<User>> insert1(User user) {
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		responseStructure.setStatus(HttpStatus.CREATED.value());
		responseStructure.setMessage("Successfully Inserted");
		responseStructure.setData(userDao.insert(user));
		return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.CREATED);
	}

	public User delete(int id) {
		return userDao.delete(id);
	}

	public ResponseStructure<User> delete1(int id) {
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		responseStructure.setStatus(HttpStatus.OK.value());
		responseStructure.setMessage("Successfully deleted");
		responseStructure.setData(userDao.delete(id));

		return responseStructure;
	}

//    	public User fetchbyid1(int id)
//    	{
//    		return userDao.fetchbyid(id);
//    	}

	public ResponseEntity<ResponseStructure<User>> fetchbyid2(int id) {
		ResponseStructure<User> responseStructure = new ResponseStructure<User>();
		User user = userDao.fetchbyid2(id);
		if (user != null) {
			responseStructure.setData(userDao.fetchbyid2(id));
			responseStructure.setStatus(HttpStatus.FOUND.value());
			responseStructure.setMessage("Successfully fetched");

			return new ResponseEntity<ResponseStructure<User>>(responseStructure, HttpStatus.FOUND);

		} else {
			throw new UserIdNotFoundException();
		}

	}

//    	public ResponseStructure<User> fetchall()
//    	{
//    		ResponseStructure<User> responseStructure=new ResponseStructure<User>();
//    		responseStructure.setStatus(HttpStatus.FOUND.value());
//    		responseStructure.setMessage("Succesfully Fetched");
//    		responseStructure.setData(userDao.fetchall());
//    		
//    		return responseStructure;
//    		
//    		//  return userDao.fetchall();
//    	}

	public User update(int id, User user) {
		return userDao.update(id, user);
	}

	public User updatetwo(User user) {
		return userDao.updatetwo(user);
	}
}

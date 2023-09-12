package com.app.FoodApp.dto.Repo.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.FoodApp.dto.User;
import com.app.FoodApp.service.UserService;
import com.app.FoodApp.service.util.ResponseStructure;

@RestController
@RequestMapping("/user")
public class UserControl 
{
	@Autowired
	
	private UserService userService;
	
	
	@PostMapping
	public User save(@Validated @RequestBody User user2)
	{	
		return userService.save(user2);
	}
//	
//	@PostMapping
//	public ResponseStructure<User> insert(@RequestBody User user1)
//	{
//		return userService.insert(user1);
//	}
//	
//	@PostMapping
//	public ResponseStructure<User> insert1(@RequestBody User user1)
//	{
//		return userService.insert(user1);
//	}

	@DeleteMapping
	public User delete(@RequestParam int id)
	{
		return userService.delete(id);
	}
	

//	@DeleteMapping("/deleteone")
//	public ResponseStructure<User> delete1(@RequestParam int id)
//	{
//		return userService.delete1(id);
//	}
	
	
	
	
	
//	@GetMapping("/fetchbyid1")
//	public User fetchbyid1(@RequestParam int id)
//	{
//		return userService.fetchbyid(id);
//	}
	
	@GetMapping
	public ResponseEntity<ResponseStructure<User>> fetchbyid2(@RequestParam int id)
	{
		return userService.fetchbyid2(id);
	}
	
	
	@PutMapping
	public User update(@RequestParam int id,@RequestBody User user)
	{
		return userService.update(id,user);
	}
//	
//	@PutMapping
//	public User updatetwo(@RequestBody User user)
//	{
//		return userService.updatetwo(user);
//	}

//	
//	@GetMapping("/fetchall")
//	public ResponseStructure<User> fetchall()
//	{
//		return userService.fetchall();
//	}
	
}

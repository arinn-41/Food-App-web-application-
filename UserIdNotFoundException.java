package com.app.FoodApp.service.util.Exception;

public class UserIdNotFoundException  extends RuntimeException
{
	private String message="User Not Found";

	public  String getMessage() {
		return message;
	}

	public UserIdNotFoundException()
	{
		
	}
}

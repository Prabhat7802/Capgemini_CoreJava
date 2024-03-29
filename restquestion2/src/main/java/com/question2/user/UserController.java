package com.question2.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/{userName}/{userPass}")
	public String validate(@PathVariable String userName,@PathVariable String userPass){
		
		return this.userService.auth(userName, userPass);
	}
	
	@PostMapping("/user")
	public void createUser(@RequestBody Userss user) {
		this.userService.addUser(user);
	}

}

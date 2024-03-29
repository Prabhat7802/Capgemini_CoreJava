package com.question2.user;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String auth(String userName, String userPass) {

		Optional<Userss> user = this.userRepository.findById(userName);
		String userPass2 = user.get().getUserPass();
		if (userPass2.equals(userPass)) {
			return "Valid User";
		} else {
			return "Invalid User";
		}

	}

	public void addUser(Userss user) {
		this.userRepository.save(user);
	}

}

package com.question2.user;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Userss, String> {
	public Optional<Userss> findById(String userName);

}

package org.example.repository;

import org.example.user.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * Class responsible for TODO: Fill me
 */
@Repository
public class UserRepository {
	
	private final Set<User> users = new HashSet<>();
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public Set<User> getUsers() {
		return users;
	}
	
	public Optional<User> getUserById(int id) {
		return users.stream()
				.filter(user -> user.getId().equals(String.valueOf(id)))
				.findFirst();
	}
	
}

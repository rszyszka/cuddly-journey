package org.example.controller;

import lombok.RequiredArgsConstructor;
import org.example.repository.UserRepository;
import org.example.user.api.UserApi;
import org.example.user.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

/**
 * Class responsible for TODO: Fill me
 */
@Controller
@RequiredArgsConstructor
public class UserController implements UserApi {
	
	private final UserRepository userRepository;
	
	
	@Override
	public ResponseEntity<List<User>> userGet() {
		return ResponseEntity.ok(new ArrayList<>(userRepository.getUsers()));
	}
	
	@Override
	public ResponseEntity<Void> userPost(User user) {
		userRepository.addUser(user);
		return ResponseEntity.ok().build();
	}
}

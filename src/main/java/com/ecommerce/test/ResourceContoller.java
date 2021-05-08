package com.ecommerce.test;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;


@RestController
public class ResourceContoller {

	@Autowired
	Userjparepository userRepo;

	@Autowired
	Addressjparepository addressRepo;

	@PostMapping("/ecommerce/v1/users")
	public ResponseEntity addNewUser(@Valid @RequestBody User user) {

		User savedUser = userRepo.save(user);

		URI urilocation = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedUser.getId()).toUri();

		return ResponseEntity.created(urilocation).build();

	}

	@PostMapping("/ecommerce/v1/users/{id}/address")
	public ResponseEntity addUserAddress(@PathVariable int id, @RequestBody Address address) {

		Optional<User> optionalUser = userRepo.findById(id);
		if (!optionalUser.isPresent()) {
			throw new UserNotFoundException("id-" + id);
		}
		User profileCreatedForUser = optionalUser.get();
		address.setUser(profileCreatedForUser);
		Address savedAddress = addressRepo.save(address);

		URI urilocation = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(savedAddress.getId()).toUri();

		return ResponseEntity.created(urilocation).build();

	}

	// Retrieve All users
	@GetMapping(value = "/ecommerce/v1/users")
	public List<User> retrieveAllUser() {
		List<User> userList = userRepo.findAll();
		if (userList.isEmpty()) {
			throw new UserNotFoundException("No User Present");
		}
		return userList;
	}
}

package com.elegant.swagger.rest;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.elegant.swagger.to.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "User Rest Controller")
@RequestMapping(value = "/rest/user")
public class UserController {

	@ApiOperation(value = "Get all users", notes = "Returns all users")
	@RequestMapping(value = "/all", method = RequestMethod.GET, 
	produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> userAll() {
		User u1 = new User("Sushant Kumar Gadi", "sushantgadi@gmail.com", 
				"+919953338815", "Gurgaon");
		User u2 = new User("User2", "user@gmail.com", "+919953338816", "Lucknow");

		List<User> userList = new ArrayList<>();
		userList.add(u1);
		userList.add(u2);

		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}

	@ApiOperation(value = "Create new user", notes = "Create new user")
	@RequestMapping(value = "/", method = RequestMethod.POST, 
	produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> save(@Valid @RequestBody User user) {
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

}

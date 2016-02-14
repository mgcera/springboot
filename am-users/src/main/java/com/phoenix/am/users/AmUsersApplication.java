package com.phoenix.am.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phoenix.am.users.domain.User;

@SpringBootApplication
@RestController
public class AmUsersApplication implements CommandLineRunner {
	
	private static List<User> users = new ArrayList<User>();


	public static void main(String[] args) {
		SpringApplication.run(AmUsersApplication.class, args);
	}


	@Override
	public void run(String... arg0) throws Exception {
		users.add(new User("Ryan", "Baxter", "g0105679",  Arrays.asList("123", "456")));
		users.add(new User("Stephanie", "Baxter", "g0105678",  Arrays.asList("456")));		
	}
	
	@RequestMapping("/")
	public List<User> getUsers() {
		return users;
	}
	
	@RequestMapping("/assets/{id}")
	public List<User> getUsers(@PathVariable String id) {
		return users.stream().filter(p -> p.getAssets().contains(id)).collect(Collectors.toList());
	}
	
	
}

package com.designpattern.demo.javadesignpatternsplayground.builder;

public class Main {

	public static void main(String[] args) {
		User user = getUserFromDB();
		UserDTO userDTO = UserDTO.getBuilder(user.getId())
				.withName(user.getName())
				.withAddress(user.getAddress())
				.build();
		System.out.println(userDTO);
		
	}
	
	static User getUserFromDB() {
		User user = new User();
		user.setId(1L);
		user.setName("Dev");
		user.setAddress(new Address("main street", "NY", "12345"));
		return user;
	}
}


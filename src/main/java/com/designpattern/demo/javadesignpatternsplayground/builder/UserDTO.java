package com.designpattern.demo.javadesignpatternsplayground.builder;

public class UserDTO {

	private Long id;
	private String name;
	private String street;
	private String city;
	private String zipcode;

	public static UserDTOBuilder getBuilder(Long id) {
		return new UserDTOBuilder(id);
	}
	
	private UserDTO(UserDTOBuilder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.street = builder.street;
		this.city = builder.city;
		this.zipcode = builder.zipcode;
	}

	public static class UserDTOBuilder {

		private Long id;
		private String name;
		private String street;
		private String city;
		private String zipcode;
		
		public UserDTOBuilder(Long id) {
			this.id = id;
		}
		
		public UserDTOBuilder withName(String name) {
			this.name = name;
			return this;
		}
		
		public UserDTOBuilder withAddress(Address address) {
			this.street = address.getStreet();
			this.city = address.getCity();
			this.zipcode = address.getZipcode();
			return this;
		}

		public UserDTO build() {
			return new UserDTO(this);
		}
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getZipcode() {
		return zipcode;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", street=" + street + ", city=" + city + ", zipcode=" + zipcode
				+ "]";
	}
}

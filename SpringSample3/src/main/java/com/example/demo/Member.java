package com.example.demo;

/**
 *  Class for mapping Name, Address and Telno
 *  Used as the "type" when creating list values.
 */
public class Member {

	// Member
	private String name;
	private String address;
	private String telno;

	// Name Getter/Setter
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	// Address Getter/Setter
	public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address; }

	// Telno Getter/Setter
	public String getTelno() { return telno; }
	public void setTelno(String telno) { this.telno = telno; }

	/*
	 * Default constructor
	 */
	public Member() {}

	/*
	 *  Constructor
	 *  @param name User's name
	 *  @param address User's address
	 *  @param telno User's phone number
	 */
	public Member(String name, String address, String telno) {
		this.name = name;
		this.address = address;
		this.telno = telno;
	}
}


package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

	public boolean addFooMember() {
		
		System.out.println(getClass() + ": DOING STUFF: ADDING A MEMBERSHIP FOO MEMBER");
		
		return true;
	}
	
	public void goToSleep() {
		
		System.out.println(getClass() + ": I'm going to sleep now...");
		
	}
}

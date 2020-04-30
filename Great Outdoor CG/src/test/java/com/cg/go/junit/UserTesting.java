package com.cg.go.junit;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.cg.go.bean.UserDetails;

public class UserTesting {
	UserDetails user = new UserDetails();
	@Test
	public void test1(){
		String expected="qwerty123";
		String actual=user.setUserId(expected);
		assertEquals(expected,actual);
		
	}
	@Test
	public void test2(){
		String expected="Qwerty1@";
		String actual=user.setPassword(expected);
		assertEquals(expected,actual);
		
	}
	@Test
	public void test3(){
		String expected="abcd@gmail.com";
		String actual=user.setEmail(expected);
		assertEquals(expected,actual);
		
	}
	@Test
	public void test4(){
		long expected=989769897;
		long actual=user.setPhNum(expected);
		assertEquals(expected,actual);
		
	}
}

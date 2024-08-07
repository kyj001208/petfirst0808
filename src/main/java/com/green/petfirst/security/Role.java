package com.green.petfirst.security;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Role {
	
	admin("관리자"),
	petfir("회원");

	private final String rolename;
	
	public final String rolename() {
		
		return rolename;
	}
}

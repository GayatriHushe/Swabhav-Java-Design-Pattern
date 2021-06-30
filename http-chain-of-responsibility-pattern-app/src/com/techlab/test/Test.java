package com.techlab.test;

import com.techlab.model.AuthenticationChecker;
import com.techlab.model.CompressionChecker;
import com.techlab.model.CookieHandler;
import com.techlab.model.HttpRequestDTO;

public class Test {

	public static void main(String[] args) throws Exception {
		CookieHandler cookie = new CookieHandler();
		AuthenticationChecker auth = new AuthenticationChecker();
		CompressionChecker compression = new CompressionChecker();
		
		cookie.setNext(auth);
		auth.setNext(compression);
		
		HttpRequestDTO dto=new HttpRequestDTO();
		dto.username="admin";
		dto.password="admin";
		
		cookie.check(dto);
	}

}

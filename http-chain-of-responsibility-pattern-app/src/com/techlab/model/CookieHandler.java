package com.techlab.model;

public class CookieHandler extends HttpSecurityChecker{

	@Override
	public void check(HttpRequestDTO dto) throws Exception {
		System.out.println("Checking Cookies");
		this.checkNext(dto);
	}

}

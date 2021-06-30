package com.techlab.model;

public class AuthenticationChecker extends HttpSecurityChecker {

	@Override
	public void check(HttpRequestDTO dto) throws Exception {
		System.out.println("Checking Authentication");
		if (!(dto.username.equals("admin") || dto.password.equals("admin")))
			throw new Exception("Wrong credentials");
		this.checkNext(dto);
	}

}

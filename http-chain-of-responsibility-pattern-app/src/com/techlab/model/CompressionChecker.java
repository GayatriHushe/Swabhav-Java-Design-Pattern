package com.techlab.model;

public class CompressionChecker extends HttpSecurityChecker{

	@Override
	public void check(HttpRequestDTO dto) throws Exception {
		System.out.println("Checking Compression");

		System.out.println("You are all done!");

	}

}

package com.techlab.model;

public class LightChecker extends HomeSecurityChecker{

	@Override
	public void check(HomeStatusDTO dto) throws Exception {
		System.out.println("checking Lights");
		if(!dto.lightsOff) {
			throw new Exception("Lights are on");
		}
		else {
			this.checkNext(dto);
		}
	}

}

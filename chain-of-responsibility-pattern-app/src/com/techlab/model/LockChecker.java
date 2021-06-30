package com.techlab.model;

public class LockChecker extends HomeSecurityChecker{

	@Override
	public void check(HomeStatusDTO dto) throws Exception {
		System.out.println("Checking Locks");
		if(!dto.LocksOn) {
			throw new Exception("Locks are on");
		}
		else {
			System.out.println("You are all done!");
		}
		
	}

}

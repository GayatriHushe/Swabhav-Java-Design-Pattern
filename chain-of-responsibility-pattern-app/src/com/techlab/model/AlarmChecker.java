package com.techlab.model;

public class AlarmChecker extends HomeSecurityChecker {

	@Override
	public void check(HomeStatusDTO dto) throws Exception {
		System.out.println("Checking Alarm");
		if(! dto.alarmOn)
			throw new Exception("Alarm is Off");
		this.checkNext(dto);
	}

}

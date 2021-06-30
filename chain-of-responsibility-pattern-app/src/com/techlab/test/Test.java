package com.techlab.test;

import com.techlab.model.AlarmChecker;
import com.techlab.model.HomeStatusDTO;
import com.techlab.model.LightChecker;
import com.techlab.model.LockChecker;

public class Test {

	public static void main(String[] args) throws Exception {
		LightChecker lights = new LightChecker();
		AlarmChecker alarm = new AlarmChecker();
		LockChecker locks = new LockChecker();
		
		lights.setNext(alarm);
		alarm.setNext(locks);
		
		HomeStatusDTO dto=new HomeStatusDTO();
		dto.lightsOff=true;
		dto.alarmOn=true;
		dto.LocksOn=true;
		
		lights.check(dto);
	}

}

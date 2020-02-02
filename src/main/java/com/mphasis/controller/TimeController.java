package com.mphasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mphasis.bean.CheckInOutTime;
import com.mphasis.dao.TimeDaoImpl;
import com.mphasis.service.UtilityService;

@Controller
public class TimeController {
	
	@Autowired
	private TimeDaoImpl timeDaoImpl;
	
	@Autowired
	private UtilityService utilityService;
	
	@RequestMapping("addEmpId")
	public @ResponseBody String inTime(@RequestParam("empId") int empId) {
		CheckInOutTime checkInOutTime = new CheckInOutTime();
		checkInOutTime.setDate(utilityService.getDate());
		checkInOutTime.setInTime(utilityService.getTime());
		checkInOutTime.setEmpId(empId);
		timeDaoImpl.checkInTime(checkInOutTime);
		return "checked in successfully";
	}
	
}

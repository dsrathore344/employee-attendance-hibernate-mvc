package com.mphasis.service;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Service;

@Service
public class UtilityService {

	public String getDate() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
		Date date = new Date(System.currentTimeMillis());
		return formatter.format(date);
	}
	
	public String getTime() {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");  
		Time time = new Time(System.currentTimeMillis());
		return formatter.format(time);
	}
}

package com.yy.spring.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class FormatterTimeString {

	public String getNewTimeString() {
		Date date=new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmSS");
		String newTimeString = simpleDateFormat.format(date);
		return newTimeString;
	}
}

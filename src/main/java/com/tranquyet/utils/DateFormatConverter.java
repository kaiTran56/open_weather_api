package com.tranquyet.utils;

import java.text.ParseException;
import java.time.Instant;

public class DateFormatConverter {

	public static String convertUTCtoISO(Long utcTime) throws ParseException {

		return Instant.ofEpochSecond(utcTime).toString().replaceAll("[TZ]", " ");
	}
}

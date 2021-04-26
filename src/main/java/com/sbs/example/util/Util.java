package com.sbs.example.util;

public class Util {
	public static String f(String format, Object...values ) {
		return String.format(format, values);
	}

	public static int pi(String numeric, int defaultValue) {
		try {
			return Integer.parseInt(numeric);			
		}
		catch ( Exception e ) {
			return defaultValue;
		}
	}
}

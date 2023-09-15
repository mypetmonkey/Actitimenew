package com.genericutilities;

import java.util.Date;
import java.util.Random;

public class JavaUtilities {
	
	public int getRandom() {
		Random ran=new Random();
		int random = ran.nextInt(500);
		return random;
	}
	
	
	public String getSystemDate() {
		Date dt=new Date();
		String date = dt.toString();
		return date;
	}

	public String getPopupDigits(String data) {
		String digit="";
	    for(int i=0;i<data.length();i++) {
	    	if(Character.isDigit(data.charAt(i)))
	    		digit=digit+data.charAt(i);
	    }
	    return digit;
	}

}

package com.zcg.learning.common;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Test {
	public static void main(String[] args) throws ParseException {
		/*long a = 1L;
		long b = 3L;
		DecimalFormat df = new DecimalFormat("#.00");  
		System.out.println(df.format((double)a/b*100));*/
		
//		System.out.println("123,245,2345".replace(",", ""));
//		
//		Boolean b = true;
//		List<String> a = new ArrayList<>();
		
//		Long l1 = 0l;
//		System.out.println(l1==0L);
//		String mail = "111@asdf-cc.com";
//		boolean isMatch = mail.matches("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
//		System.out.println(isMatch);
//		float a = 16.3333f;
//		System.out.println(Math.round(a));
//		DecimalFormat df = new DecimalFormat("#.00");  
//		System.out.println(df.format(16.3333f));
		
//		String sss = "aaa\\ccc\\vb.pdf";
//	    System.out.println(sss.replace("\\", "/"));
		
//		BigDecimal s = new BigDecimal("4360538.60 ");
//		System.out.println(s);
		
		//字符串三位空格分开
		String faxReceiveAccountHolder = "123456776";
		String regex = "(.{3})";
		faxReceiveAccountHolder = faxReceiveAccountHolder.replaceAll(regex, "$1 ");
		System.out.println(faxReceiveAccountHolder);
		
		//数字分隔
		DecimalFormat df = new DecimalFormat("#,###.00"); 
        System.out.println(df.format(12345678.01));
	}
}
 
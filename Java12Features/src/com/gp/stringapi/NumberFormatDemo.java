package com.gp.stringapi;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo {
	
	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCompactNumberInstance();
		System.out.println(format.format(1000));
		NumberFormat format1 =NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.SHORT);
		System.out.println(format1.format(1000));
		System.out.println(format1.format(1000000));
		
		NumberFormat format2 =NumberFormat.getCompactNumberInstance(Locale.US,NumberFormat.Style.LONG);
		System.out.println(format2.format(1000));
		System.out.println(format2.format(1000000));
		
	}

}

/*
 * 1K
 *  1K 
 *  1M 
 *  1 thousand
 *   1 million
 */

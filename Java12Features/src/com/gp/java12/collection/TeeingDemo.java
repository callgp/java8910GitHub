package com.gp.java12.collection;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingDemo {
	
	public static void main(String[] args) {
		Result result = Stream.of(5,10,8,20,7).collect(Collectors.teeing(Collectors.counting(),Collectors.filtering(n->Integer.parseInt(n.toString())>10, Collectors.toList()),Result::new));
		//adds 2 dwnstreams uisn teeing
		System.out.println(result);
	}

}

//Result [count=5, filtered=[20]]//only 20 greater than 10 and count total 5 we passed

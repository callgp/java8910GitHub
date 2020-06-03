package com.gp.streamig;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,20,7,40,12,13);
		System.out.println(list.stream().filter(x->x%5==0).collect(Collectors.toList()));//[10, 20, 40]
		System.out.println(list.stream().takeWhile(x->x%5==0).collect(Collectors.toList()));
		System.out.println(list.stream().dropWhile(x->x%5==0).collect(Collectors.toList()));
		//System.out.println(list.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList()));

	}

}

/*
 * [10, 20, 40] 
 * [10, 20] 
 * [7, 40, 12, 13]//after confition match it print rest of
 * them
 */
		
/*
 * [10, 20, 40] 
 * [10, 20] takewhile once hit 7 stops wont print 40 down
 */
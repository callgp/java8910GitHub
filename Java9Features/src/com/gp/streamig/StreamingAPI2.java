package com.gp.streamig;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingAPI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,20,40,12,13);
		System.out.println(list.stream().filter(x->x%5==0).collect(Collectors.toList()));//[10, 20, 40]


	}

}

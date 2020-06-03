package com.gp.streamig;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPIFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,20,40,12,null,13);
		//System.out.println(list.stream().filter(x->x%5==0).collect(Collectors.toList()));//[10, 20, 40]
		System.out.println(list.stream().takeWhile(x->x%5==0).collect(Collectors.toList()));
		System.out.println(list.stream().dropWhile(x->x%5==0).collect(Collectors.toList()));
		System.out.println(list.stream().flatMap(x->Stream.ofNullable(x)).collect(Collectors.toList()));

	}

}

[10, 20, 40]
[12, null, 13]
[10, 20, 40, 12, 13] //last one skips null

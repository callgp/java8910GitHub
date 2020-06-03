package com.gp.immutable;

import java.util.List;

public class DemoImmutableCollectionNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = List.of("e1"," e2", "123");
		list.add("nyc");

	}

}
/*
 * Exception in thread "main" java.lang.UnsupportedOperationException at
 * java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:73) at
 * java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(
 * ImmutableCollections.java:77) at
 * com.gp.immutable.DemoImmutableCollection.main(DemoImmutableCollection.java:
 * 11)
 */
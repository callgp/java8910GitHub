package com.gp.immutable;

import java.util.List;

public class DemoImmutableCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = List.of("e1"," e2", "123");
	//	list.add("nyc");
		List<String> list2 = List.of("e1"," e2", "123",null);//cannot add null
		
		/*
		 * Exception in thread "main" java.lang.NullPointerException at
		 * java.base/java.util.Objects.requireNonNull(Objects.java:222) at
		 * java.base/java.util.ImmutableCollections$ListN.<init>(ImmutableCollections.
		 * java:483) at java.base/java.util.List.of(List.java:862) at
		 * com.gp.immutable.DemoImmutableCollection.main(DemoImmutableCollection.java:
		 * 12)
		 */

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
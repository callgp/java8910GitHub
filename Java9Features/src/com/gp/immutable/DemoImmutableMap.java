package com.gp.immutable;

import java.util.Set;

public class DemoImmutableMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = Set.of("e1"," e2", "123","e3","e1");//cannt add e1 again
		
		/*
		 * Exception in thread "main" java.lang.IllegalArgumentException: duplicate
		 * element: e1 at
		 * java.base/java.util.ImmutableCollections$SetN.<init>(ImmutableCollections.
		 * java:712) at java.base/java.util.Set.of(Set.java:542) at
		 * com.gp.immutable.DemoImmutableSet.main(DemoImmutableSet.java:10)
		 */
 
	   // set.add("e2");
		//List<String> list2 = List.of("e1"," e2", "123",null);//cannot add null
		
	    
		/*
		 * Exception in thread "main" java.lang.UnsupportedOperationException at
		 * java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:73) at
		 * java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(
		 * ImmutableCollections.java:77) at
		 * com.gp.immutable.DemoImmutableSet.main(DemoImmutableSet.java:11)
		 */
	    
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
package java10features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=List.of(15,20,17,30);
	//	List<Integer> newList = list.stream().filter(i->i%3==0).collect(Collectors.toList());
		//upt o java 9 can add as below
		//newList.add(40);
		//but if some restictions i want u can do here
		List<Integer> newList2 = list.stream().filter(i->i%3==0).collect(Collectors.toList());
		newList2.add(400);
		System.out.println(newList2);
		//[15, 30, 400] toList we can add more..unmodifiablelist u cannot add more
	}

}
/*sam efor list and map
 * Exception in thread "main" java.lang.UnsupportedOperationException at
 * java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:73) at
 * java.base/java.util.ImmutableCollections$AbstractImmutableCollection.add(
 * ImmutableCollections.java:77) at
 * java10features/java10features.CollectorsDemo.main(CollectorsDemo.java:16)
 */

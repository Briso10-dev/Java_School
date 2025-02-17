// Operation on Sort Interface

import java.util.*;

public class SetOperation {

	public static void main(String[] args) {
		System.out.println("Welcome to this Program\n");
		//creation of the two sets
		Integer[] array1 = {1,2,3,4,5,6,7};
		Integer[] array2 = {10,9,8,7,0,2,1,4};
		
		//Implementating the sets
		Set<Integer> seta = new HashSet();
		seta.addAll(Arrays.asList(array1));
		
		Set<Integer> setb = new HashSet();
		setb.addAll(Arrays.asList(array2));
		
		//Implementing the different Set operations:
        //Union:
		Set<Integer> union = new HashSet(seta);
		union.addAll(setb);
		System.out.println("Union of the two Set : " + union);
		
		//Intersection:
		Set<Integer> intersection = new HashSet(seta);
	    intersection.retainAll(setb);
		System.out.println("Intersection of the two Set : " + intersection);
				
		//Union:
		Set<Integer> differences = new HashSet(seta);
		union.removeAll(setb);
		System.out.print("Differences of the two Set : " + differences);
	}

}

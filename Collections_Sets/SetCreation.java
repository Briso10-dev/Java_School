
import java.util.HashSet; //import Set collection from the java.util package
import java.util.Set;

public class SetCreation {
	public static void main(String args[]) {
		//creating a Set collection
		Set<String> hash_set = new HashSet<>();
		
		//printing the set collection
		System.out.println("Set collection : " + hash_set);
		
		//methods and Operations on the set interface/SortedSet:
		hash_set.add("Briso");
		hash_set.add("Dreamer");
		hash_set.add("Poor");
		hash_set.add("Briso");
		
		//Testing if a given Set contains an object:
		String odd = "rich";
		System.out.println("Set check that " + odd + " is "+ hash_set.contains(odd));
		
		//printing the set collection after first method
	    System.out.println("Set collection : " + hash_set);
	    
	    //Removing the value "Poor"...>Yeah wanna not remain poor : 
	    hash_set.remove("Poor");
	    //printing the set collection after first method
	    System.out.println("\nNow I am not poor..) : " + hash_set);

		 //Iterating through a set
		 for(String value : hash_set){
			System.out.println(value);
		}

	}
}
      

//Resume of a Set : 
//1. A set is defined as an unordered collection(Except for LinkedHashSet,TreeSet).
//2. A set does not allow duplicate values.
//3. A set in most cases contains one null element.
//4. Set are in fact object collections..."Strings","Integer" and thus primitive data types are not used.
//5. Set is in base an interface class...thus Other classes have to implement them like : HashSet(popular),LinkedHashSet,TreeSet.
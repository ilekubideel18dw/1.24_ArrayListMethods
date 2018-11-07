import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Create a String ArrayList.
		ArrayList<String> cars = new ArrayList<String>();
		
		// Enter elements.
		System.out.println("Enter 5 cars for our Rallysprint:");
		cars.add(sc.next());
		cars.add(sc.next());
		cars.add(sc.next());
		cars.add(sc.next());
		cars.add(sc.next());
		
		// See the ArrayList content.
		System.out.println(cars);
		
		// Enter a new element in the third position.
		System.out.println("Enter a position and then enter a new car for this position:");
		cars.add(sc.nextInt(), sc.next());
		
		// See the ArrayList content.
		System.out.println(cars);
		
		// See the size of the ArrayList.
		System.out.println("We have " + cars.size() + " cars in our rallysprint.");
		
		// See the element of the second position.
		System.out.println("What positions car do you want to see?");
		System.out.println("The car of that position is a " + cars.get(sc.nextInt()));
		
		// See if the element is in the list or not with a boolean result.
		System.out.println("Enter a car brand to see its any car of that brand in the rallysprint:");
		System.out.println(cars.contains(sc.next()));
		
		// See the index of a position of the specified element in this list. If the element doesn't exists, the result is -1. 
		System.out.println("Enter a brand to see what is the first position a car with that brand is:");
		System.out.println("The first car with that brand is on the number " + cars.indexOf(sc.next()) + " position.");
		
		// See the index of the last position of the specified element in this list. If the element doesn't exists, the result is -1.
		System.out.println("Enter a brand to see what is the last position a car with that brand is:");
		System.out.println("The last car with that brand is on the number " + cars.lastIndexOf(sc.next()) + " position.");
		
		// Delete the element of any position.
		System.out.println("Enter a position to delete the car of that position:");
		cars.remove(sc.nextInt()); 
		
		// See the ArrayList content.
		System.out.println(cars);
		
		// Delete the first specified element we enter.
		System.out.println("Enter a car to delete the first car with that brand:");
		cars.remove(sc.next());
		
		// See the ArrayList content.
		System.out.println(cars);
		
		// Clone the list
		ArrayList carsCopy = (ArrayList) cars.clone();
		System.out.println("We create a copy of the list. This is the list:");
		
		// See the cloned ArrayList content.
		System.out.println(carsCopy);
		
		// Delete all the elements
		cars.clear();
		System.out.println("We have a copy, so now we are going to clean the list. This is the result:");
		
		// See the ArrayList content.
		System.out.println(cars);
				
		// See the list is empty or not with boolean result.
		System.out.println("Is the list empty? " + cars.isEmpty());  
		
		// Transform the ArrayList in an array.
		Object[] array = cars.toArray(); 
		
		System.out.println("Thats all. Bye!");

	}
}
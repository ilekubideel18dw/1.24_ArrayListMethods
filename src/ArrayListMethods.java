import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		// Create a variable to make a loop.
		int wh = 0;
		
		// Define a variable with Scanner.
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
		
		while (wh != 1) {
			System.out.println("Welcome to list editor! What do you want to do? Options:");
			System.out.println("1.- Add new car in any position.");
			System.out.println("2.- Count the cars in the list.");
			System.out.println("3.- See a car of any position.");
			System.out.println("4.- See there is a car with a specified brand.");
			System.out.println("5.- See the first car in the list with a specified brand.");
			System.out.println("6.- See the last car in the list with a specified brand.");
			System.out.println("7.- Delete a car of any position.");
			System.out.println("8.- Delete the first car of the list with specified brand.");
			System.out.println("9.- Clone the list.");
			System.out.println("10.- Clear the list.");
			System.out.println("11.- See the list is empty or not.");
			System.out.println("Choose your option:");
			
			// Here I use Scanner to use one number between 1 & 7.
			int sw = sc.nextInt();
			
			// With Switch, I can ask for any option between 1 & 7.
			switch (sw) {
			
				case 1:

					// Enter a new element in the any position position.
					System.out.println("Enter a position and then enter a new car for this position:");
					cars.add(sc.nextInt(), sc.next());
				
					// See the ArrayList content.
					System.out.println(cars);
					
					// Here, I create a little program to access to another option
            		// without restart the program
            		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
            		int continue1 = sc.nextInt();
            		if (continue1 < 1) {
            			wh = 1;
            		}
            		break;
            		
				case 2:
				
					// See the size of the ArrayList.
					System.out.println("We have " + cars.size() + " cars in our rallysprint.");
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue2 = sc.nextInt();
	        		if (continue2 < 1) {
	        			wh = 1;
	        		}
	        		break;
				
				case 3:
		        		
					// See the element of any position.
					System.out.println("What positions car do you want to see?");
					System.out.println("The car of that position is a " + cars.get(sc.nextInt()));
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue3 = sc.nextInt();
	        		if (continue3 < 1) {
	        			wh = 1;
	        		}
	        		break;
				
				case 4:
					
					// See if the element is in the list or not with a boolean result.
					System.out.println("Enter a car brand to see its any car of that brand in the rallysprint:");
					System.out.println(cars.contains(sc.next()));
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue4 = sc.nextInt();
	        		if (continue4 < 1) {
	        			wh = 1;
	        		}
	        		break;
					
				case 5:	
					
					// See the index of a position of the specified element in this list. If the element doesn't exists, the result is -1. 
					System.out.println("Enter a brand to see what is the first position a car with that brand is:");
					System.out.println("The first car with that brand is on the number " + cars.indexOf(sc.next()) + " position.");
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue5 = sc.nextInt();
	        		if (continue5 < 1) {
	        			wh = 1;
	        		}
	        		break;
					
				case 6:	
					
					// See the index of the last position of the specified element in this list. If the element doesn't exists, the result is -1.
					System.out.println("Enter a brand to see what is the last position a car with that brand is:");
					System.out.println("The last car with that brand is on the number " + cars.lastIndexOf(sc.next()) + " position.");
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue6 = sc.nextInt();
	        		if (continue6 < 1) {
	        			wh = 1;
	        		}
	        		break;
					
				case 7:
					
					// Delete the element of any position.
					System.out.println("Enter a position to delete the car of that position:");
					cars.remove(sc.nextInt()); 
					
					// See the ArrayList content.
					System.out.println(cars);
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue7 = sc.nextInt();
	        		if (continue7 < 1) {
	        			wh = 1;
	        		}
	        		break;
					
				case 8:	
					
					// Delete the first specified element we enter.
					System.out.println("Enter a car to delete the first car with that brand:");
					cars.remove(sc.next());
					
					// See the ArrayList content.
					System.out.println(cars);
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue8 = sc.nextInt();
	        		if (continue8 < 1) {
	        			wh = 1;
	        		}
	        		break;
					
				case 9:	
					
					// Clone the list
					ArrayList carsCopy = (ArrayList) cars.clone();
					System.out.println("We create a copy of the list. This is the list:");
					
					// See the cloned ArrayList content.
					System.out.println(carsCopy);
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue9 = sc.nextInt();
	        		if (continue9 < 1) {
	        			wh = 1;
	        		}
	        		break;
					
				case 10:	
					
					// Delete all the elements
					cars.clear();
					System.out.println("We are going to clean the list. This is the result:");
					
					// See the ArrayList content.
					System.out.println(cars);
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue10 = sc.nextInt();
	        		if (continue10 < 1) {
	        			wh = 1;
	        		}
	        		break;
					
				case 11:	
					
					// See the list is empty or not with boolean result.
					System.out.println("Is the list empty? " + cars.isEmpty());  
					
					// Here, I create a little program to access to another option
	        		// without restart the program
	        		System.out.println("Do you want to finish or do you want another option? Enter 0 to finish or another number to continue:");
	        		int continue11 = sc.nextInt();
	        		if (continue11 < 1) {
	        			wh = 1;
	        		}
	        		break;
					
				default:
					
					System.out.println("Incorrect option, try again.");
            		break;
			
			}
		}
	// Transform the ArrayList in an array.
	Object[] array = cars.toArray();
	
	
	System.out.println("Thank you! Bye!");	
		
	}
}
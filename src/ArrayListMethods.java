import java.util.ArrayList;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		// Create a String ArrayList.
		ArrayList<String> cars = new ArrayList<String>();
		
		// Enter elements.
		cars.add("Fiat");
		cars.add("Volvo");
		cars.add("Opel");
		cars.add("Seat");
		cars.add("Nissan");
		cars.add("Citroen");
		cars.add("Seat");
		
		// See the ArrayList content.
		System.out.println(cars);
		
		// Enter a new element in the third position.
		cars.add(3, "Mercedes");
		
		// See the ArrayList content.
		System.out.println(cars);
		
		// See the size of the ArrayList.
		System.out.println("We have " + cars.size() + " cars in our parking.");
		
		// See the element of the second position.
		System.out.println("The car of the second position is a " + cars.get(2));
		
		// See if the element is in the list or not with a boolean result.
		System.out.println("Is any Fiat in the parking? " + cars.contains("Fiat"));
		
		// See the index of the first position of the specified element in this list 
		System.out.println("The first Seat is in the position number " + cars.indexOf("Seat"));
		
		// It is not any Ferrari, so the result is -1.
		System.out.println("The first Ferrari is in the position number " + cars.indexOf("Ferrari"));
		
		// See the index of the last position of the specified element in this list.
		System.out.println("The last Seat is in the position number" + cars.lastIndexOf("Seat"));
		
		// It is not any Ferrari, so the result is -1.
		System.out.println("The last Ferrari is in the position number" + cars.lastIndexOf("Ferrari"));
		
		/*
		nombreArrayList.remove(5); 
		
		nombreArrayList.remove("Elemento");
		
		nombreArrayList.clear();
		
		nombreArrayList.isEmpty();  
		
		ArrayList arrayListCopia = (ArrayList) nombreArrayList.clone();  
		
		Object[] array = nombreArrayList.toArray(); 
		*/
	}
}
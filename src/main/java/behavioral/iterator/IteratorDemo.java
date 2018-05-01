package behavioral.iterator;

//import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		BikeRepository repo = new BikeRepository();

		repo.addBike("Cervelo");
		repo.addBike("Scott");
		repo.addBike("Fuji");

		// Iterator<String> bikeIterator = repo.iterator();

		// you can use .hasNext() when you have your class implement Iterable
		// while(bikeIterator.hasNext()) {
		// System.out.println(bikeIterator.next());
		// }

		// when your class implements Iterable you can use your class with for each
		for (String bike : repo) {
			System.out.println(bike);
		}
	}
}


import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// The program below is meant for testing the search algorithms you'll write
		Scanner scanner = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();

		// User query

		System.out.println("How many books to create?");
		int numberOfBooks = Integer.valueOf(scanner.nextLine());
		for (int i = 0; i < numberOfBooks; i++) {
			books.add(new Book(i, "name for the book " + i));
		}

		books.add(new Book(287841, "name 287841"));
		books.add(new Book(99328, "name 99328"));

		System.out.println("Id of the book to search for?");
		int idToSearchFor = Integer.valueOf(scanner.nextLine());

		System.out.println("");
		System.out.println("Searching with linear search:");
		long start = System.currentTimeMillis();
		int linearSearchId = linearSearch(books, idToSearchFor);
		System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
		if (linearSearchId < 0) {
			System.out.println("Book not found");
		} else {
			System.out.println("Found it! " + books.get(linearSearchId));
		}

		System.out.println("");

		System.out.println("");
		System.out.println("Seaching with binary search:");
		start = System.currentTimeMillis();
		int binarySearchId = binarySearch(books, idToSearchFor);
		System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
		if (binarySearchId < 0) {
			System.out.println("Book not found");
		} else {
			System.out.println("Found it! " + books.get(binarySearchId));
		}

	}

	public static int linearSearch(ArrayList<Book> books, int searchedId) {

		for (Book book : books) {
			if (book.getId() == searchedId) {
				return books.indexOf(book);
			}
		}

		return -1;
	}

	public static int binarySearch(ArrayList<Book> books, long searchedId) {
		int start = 0;
		int end = books.size();

		while (start < end) {
			int middle = (end + start) / 2;

			if (books.get(middle).getId() == searchedId) {
				return middle;
			} else if (books.get(middle).getId() < searchedId) {
				start = middle + 1;
			} else if (books.get(middle).getId() > searchedId) {
				end = middle;
			}
		}

		return -1;
	}
}
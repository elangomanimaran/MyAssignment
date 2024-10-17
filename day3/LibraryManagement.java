package wee1.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		Library bookDetails = new Library();
		String bookUpdate2 = bookDetails.addBook("Paths of glory and Wisdom");
		System.out.println("The Book "+bookUpdate2+" added sucessfully");
		bookDetails.issueBook();
	}

}

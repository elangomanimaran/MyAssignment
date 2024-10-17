package wee1.day3;

public class Library {
public String addBook(String bookTitle) {
	return bookTitle;
}
 void issueBook() {
	System.out.println("Book issued successfully");
}
	public static void main(String[] args) {
		Library bookUpdate = new Library();
		String bookupdate1 = bookUpdate.addBook("Art of War");
		System.out.println("The Book "+bookupdate1+" added successfully");
		bookUpdate.issueBook();
	}

}

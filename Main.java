public class Main {
    public static void main(String[] args) {
        // Create objects for each type of book
        Textbook textbook = new Textbook("Java Programming", "John Smith", 2020, "Programming");
        Novel novel = new Novel("To Kill a Mockingbird", "Harper Lee", 1960, "Classic");
        Magazine magazine = new Magazine("National Geographic", "Various", 2021, "Science");

        // Display initial book information
        System.out.println("---- Book Information ----");
        System.out.println();
        textbook.displayInfo();
        novel.displayInfo();
        magazine.displayInfo();

        // Borrow and return actions
        System.out.println("---- Borrowing and Returning Books ----");
        System.out.println();
        textbook.borrowBook();
        magazine.borrowBook();
        System.out.println("Textbook: " + textbook.getTitle() + " " + (textbook.isBorrowed() ? "borrowed successfully." : "not borrowed."));
        System.out.println("Magazine: " + magazine.getTitle() + " " + (magazine.isBorrowed() ? "borrowed successfully." : "not borrowed."));
        System.out.println("Textbook: " + textbook.getTitle() + " " + (textbook.isBorrowed() ? "returned successfully." : "not borrowed."));
        System.out.println("Novel: " + novel.getTitle() + " " + (novel.isBorrowed() ? "returned successfully." : "not borrowed."));
    }
}

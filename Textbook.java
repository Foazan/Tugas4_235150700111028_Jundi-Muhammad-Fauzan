class Textbook extends Book {
    private String subject;

    // Constructor
    public Textbook(String title, String author, int year, String subject) {
        super(title, author, year);
        this.subject = subject;
    }

    // Override borrowBook method
    @Override
    public void borrowBook() {
        super.borrowBook();
    }

    // Override returnBook method
    @Override
    public void returnBook() {
        super.returnBook();
    }
}

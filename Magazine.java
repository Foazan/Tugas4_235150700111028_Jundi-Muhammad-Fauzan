class Magazine extends Book {
    private String category;

    // Constructor
    public Magazine(String title, String author, int year, String category) {
        super(title, author, year);
        this.category = category;
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
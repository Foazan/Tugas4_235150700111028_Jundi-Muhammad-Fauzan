class Novel extends Book {
    private String genre;

    // Constructor
    public Novel(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
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
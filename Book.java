class Book implements BookOperations {
    private String title;
    private String author;
    private int year;
    private boolean borrowed;

    // Constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.borrowed = false;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    // Display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("Borrowed: " + borrowed);
        System.out.println();
    }

    // Override interface methods
    @Override
    public void borrowBook() {
        borrowed = true;
        
    }

    @Override
    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            
        
        }
    }
}
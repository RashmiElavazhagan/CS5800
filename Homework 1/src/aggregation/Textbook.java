package aggregation;

public class Textbook {
    private String bookTitle;
    private String author;
    private String publisher;

    public Textbook(String bookTitle, String author, String publisher) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }
}

package OOP_DZ_1;

public abstract class Book {
    private String BookAuthor;
    private String BookName;
    private String BookLanguage;

    public void setBookAuthor(String bookAuthor) {
        this.BookAuthor = bookAuthor;
    }

    public void setBookName(String bookName) {
        this.BookName = bookName;
    }

    public void setBookLanguage(String bookLanguage) {
        this.BookLanguage = bookLanguage;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public String getBookName() {
        return BookName;
    }

    public String getBookLanguage() {
        return BookLanguage;
    }
}

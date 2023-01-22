package OOP_DZ_1;

import java.util.ArrayList;

class LibraryBooks {
    public String bAuthor;
    public String bName;
    public String bLanguage;
}

public class Library extends Book {

    public String LibraryName;

    public Library(String libraryName) {
        this.LibraryName = libraryName;
    }

    ArrayList<LibraryBooks> listBooks = new ArrayList<>();

    public void AddBook(String bookAuthor, String bookName, String bookLanguage) {
        LibraryBooks lb = new LibraryBooks();
        setBookAuthor(bookAuthor);
        setBookName(bookName);
        setBookLanguage(bookLanguage);
        lb.bAuthor = getBookAuthor();
        lb.bName = getBookName();
        lb.bLanguage = getBookLanguage();
        listBooks.add(lb);
    }

    public ArrayList<LibraryBooks> getBookList() {
        return listBooks;
    }
}

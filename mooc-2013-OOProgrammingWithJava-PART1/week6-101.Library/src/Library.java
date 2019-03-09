
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author josia
 */
public class Library {

    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.books.add(newBook);
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> output = new ArrayList<Book>();
        for (Book book : books) {
            if (StringUtils.included(book.title(), title)) {
                output.add(book);
            }
        }
        return output;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> output = new ArrayList<Book>();
        for (Book book : books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                output.add(book);
            }
        }
        return output;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> output = new ArrayList<Book>();
        for (Book book : books) {
            if (book.year() == year) {
                output.add(book);
            }
        }
        return output;
    }
}

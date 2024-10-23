package laba_4_ot_Davida_Dmitrievicha_prosto_kapets;

import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books;
    public void addBook(Book book)
    {
        this.books.add(book);
    }
    public Library()
    {
        this.books = new ArrayList<>();
    }
    public void printAllBooks()
    {
        for (Book book : books)
        {
            book.printInfo();
            System.out.println();
        }
    }
}

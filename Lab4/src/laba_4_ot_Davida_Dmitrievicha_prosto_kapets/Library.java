package laba_4_ot_Davida_Dmitrievicha_prosto_kapets;

import java.util.ArrayList;

public class Library
{
    private ArrayList<Book> books;

    public void addBook(Book book)
    {
        this.books.add(book);
    }
    public Book popBook()
    {
        if (!books.isEmpty())
        {
            return books.remove(books.size() - 1);
        }
        else
        {
            System.out.println("Библиотека пуста, нечего удалять.");
            return null;
        }
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

    public void collectAllInfo()
    {
        int countEBook = 0;
        for (Book book : books)
        {
            if (book instanceof EBook)
            {
                countEBook++;
            }
        }
        System.out.println("Количество электронных книг: "+ countEBook);

        int countPrintedBook = 0;
        for (Book book : books)
        {
            if (book instanceof PrintedBook)
            {
                countPrintedBook++;
            }
        }
        System.out.println("Количество печатных книг: "+ countPrintedBook);
    }
}


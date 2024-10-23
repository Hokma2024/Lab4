package laba_4_ot_Davida_Dmitrievicha_prosto_kapets;

public class Book
{
    private String title;
    private String author;

    public Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public void printInfo()
    {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
    }
}

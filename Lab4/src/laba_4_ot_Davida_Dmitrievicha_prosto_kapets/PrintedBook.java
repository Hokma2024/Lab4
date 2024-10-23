package laba_4_ot_Davida_Dmitrievicha_prosto_kapets;

public class PrintedBook extends Book
{
    private String pagesCount;

    public PrintedBook(String title, String author, String pagesCount)
    {
        super(title,author);
        this.pagesCount = pagesCount;
    }

    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Число страниц: " + pagesCount);
    }
}

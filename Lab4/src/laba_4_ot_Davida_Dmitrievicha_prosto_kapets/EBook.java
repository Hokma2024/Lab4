package laba_4_ot_Davida_Dmitrievicha_prosto_kapets;

public class EBook extends Book
{
    private String fileSize;
    public EBook(String title, String author, String fileSize) {
        super(title, author);
        this.fileSize = fileSize;
    }
    @Override
    public void printInfo()
    {
        super.printInfo();
        System.out.println("Размер файла: "+fileSize);
    }

}

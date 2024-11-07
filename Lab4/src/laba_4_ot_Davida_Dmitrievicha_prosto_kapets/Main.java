package laba_4_ot_Davida_Dmitrievicha_prosto_kapets;
/*
7. Создайте классы Book, PrintedBook, и EBook. В классе Book добавьте поля для названия и автора. В классе PrintedBook добавьте поле для количества страниц, а в классе EBook — для размера файла.
Создайте класс Library, который будет хранить массив книг и выводить информацию о каждой книге.
 */
public class Main
{
    public static void main(String[] args)
    {
        EBook eBook1 = new EBook("Страдания студента", "Я","12 GB");
        PrintedBook printedBook1 = new PrintedBook("Мой дневник 2024","Я","365");
        Library library1 = new Library();
        library1.addBook(eBook1);
        library1.addBook(printedBook1);
        library1.printAllBooks();
        library1.popBook();
        library1.collectAllInfo();
    }
}
package com.company.aqa.module4.library;

public class Main {

    public static void main(String[] args) {

        Book book_1 = new Book("Тестирование DOT COM, или Пособие по жестокому обращению с багами в интернет-стартапах",
                "Савин Р.", "Дело", 2007, 310, "lite", 5.99);
        Book book_2 = new Book("Спектакль", "Джоди Линн Здрок", "Издательство АСТ", 2019, 350, "e-book", 10.50);
        Book book_3 = new Book("Корона и плаха", "Александр Бушковский", "Эксмо", 2020, 250, "e-book", 39.99);


        Library myLibrary = new Library();
        myLibrary.addBook(book_1);
        myLibrary.addBook(book_2);
        myLibrary.addBook(book_3);

        //////////////////////

        System.out.println(myLibrary.findBookByAuthor("Савин").toString());
        System.out.println(myLibrary.findBookByPublishingHouse("Эксмо").toString());
        System.out.println(myLibrary.findBookByYearOfPublishing(2008).toString());

        myLibrary.getListOfMyBook();

    }
}

package com.company.aqa.module4.library;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> myListOfBook;

    public Library() {
        this.myListOfBook = new ArrayList<>();
    }

    /**
     * Use for add book to libuary
     *
     * @param newBook {@link Book}
     */
    public void addBook(Book newBook) {
        this.myListOfBook.add(newBook);
    }

    /**
     * Use for get all books in library
     */
    public void getListOfMyBook() {
        int i = 1;
        for (Book book : myListOfBook) {
            System.out.println(i + ". " + book.getName() + "   Price: " + book.getPrice() + " $");
            i++;
        }
    }

    /**
     * Use for search book by author
     *
     * @param author author
     * @return {@link ArrayList<Book>}
     */
    public ArrayList<Book> findBookByAuthor(String author) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book search : this.myListOfBook) {
            if (search.getAuthor().contains(author)) {
                found.add(search);
            }
        }
        return found;
    }

    /**
     * Use for search book by publishing house
     *
     * @param publishingHouse publishing house
     * @return {@link ArrayList}
     */
    public ArrayList<Book> findBookByPublishingHouse(String publishingHouse) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book search : this.myListOfBook) {
            if (search.getPublishingHouse().contains(publishingHouse)) {
                found.add(search);
            }
        }
        return found;
    }

    /**
     * Use for search book by year
     *
     * @param year year
     * @return {@link ArrayList<Book>}
     */
    public ArrayList<Book> findBookByYearOfPublishing(int year) {
        ArrayList<Book> found = new ArrayList<>();
        for (Book search : this.myListOfBook) {
            if (search.getYearOfPublishing() > year) {
                found.add(search);
            }
        }
        return found;
    }
}

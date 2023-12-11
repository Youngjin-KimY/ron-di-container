package com.rooon.di;

public class BookService {

    public void rent(Book book) {
        System.out.println("rent: "+ book.getName());
    }

    public void returnBook(Book book) {
        System.out.println("return: " + book.getName());
    }
}

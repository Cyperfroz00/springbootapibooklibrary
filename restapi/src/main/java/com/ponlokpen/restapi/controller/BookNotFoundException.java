package com.ponlokpen.restapi.controller;

public class BookNotFoundException extends Exception {
    public BookNotFoundException(Long bookId) {
        super(String.format("Book is not found with id : '%s'",bookId));
    }
}

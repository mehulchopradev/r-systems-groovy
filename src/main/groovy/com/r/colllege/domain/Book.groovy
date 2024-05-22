package com.r.colllege.domain

class Book {

    String title
    Integer pages
    BigDecimal price
    List<Author> authors = []
    List<String> aliasNames = []
    List<Contact> contacts = []


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                ", authors=" + authors +
                ", aliasNames=" + aliasNames +
                ", contacts=" + contacts +
                '}';
    }
}

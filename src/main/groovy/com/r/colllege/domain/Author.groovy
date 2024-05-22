package com.r.colllege.domain

class Author {

    String name
    Character gender
    Integer ratings
    Contact contact

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", ratings=" + ratings +
                ", contact=" + contact +
                '}';
    }
}

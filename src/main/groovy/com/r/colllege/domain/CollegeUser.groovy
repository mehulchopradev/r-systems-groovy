package com.r.colllege.domain

class CollegeUser {

    String name
    Character gender // encapsulation -- m / f
    List<String> contactNos

    Character getGender() {
        this.gender?.toString().toUpperCase().toCharacter()
    }

    Character setGender(Character gender) {
        if (gender == 'm' || gender == 'f') {
            this.gender = gender
        }
        this.gender
    }

    Void printContactNos() {
        // this.contactNos.each {println it}
        // null safe operator (?.)
        for (def i = 0; i < this.contactNos?.size(); i++) {
            println this.contactNos[i]
        }
    }

    List addContact(String contactNo) {
        if(this.contactNos == null) {
            this.contactNos = []
        }

        this.contactNos << contactNo
    }

    CollegeUser leftShift(String contactNo) {
        this.addContact(contactNo)
        this
    }

    Void displayDetails() {
        // this ---> Student, Professor, Librarian
        println "Name: ${this.name}\nGender: ${this.getGender()}"
    }
}

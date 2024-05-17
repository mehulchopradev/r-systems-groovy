package com.r.colllege.domain

// groovy bean
// class ---> Class object --> 1 per class
class Student {
    // instance variables
    // properties
    String name
    Character gender
    Integer roll
    List<String> contactNos

    // static variables
    static Integer count = 0

    Student() {
        Student.count += 1
    }

    // instance methods
    Void displayDetails() {
        // current object ---> this
        println "Name: ${this.name}\nGender: ${this.gender}\nRoll: ${this.roll}"
        // println "Name: ${name}\nGender: ${gender}\nRoll: ${roll}"
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

    // static methods
    static Student createInstance(Map map) {
        new Student(map)
    }

    // constructors
    // default
    /* Student(Map map) {
        this()
        this.name = map['name']
        this.gender = map['gender']
        this.roll = map['roll']
        this.contactNos = map['contactNos']
    } */

    /* Student(String name, Character gender, Integer roll, List<String> contactNos = []) {
        // refer the current instance ---> `this`
        this.name = name
        this.gender = gender
        this.roll = roll
        this.contactNos = contactNos
    } */
}
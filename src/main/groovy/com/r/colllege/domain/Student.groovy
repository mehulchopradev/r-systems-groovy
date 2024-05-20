package com.r.colllege.domain

// groovy bean
// class ---> Class object --> 1 per class
class Student extends CollegeUser {
    // instance variables
    // properties
    Integer roll

    // static variables
    static Integer count = 0

    Integer setRoll(Integer roll) {
        if (roll >= 1) {
            this.roll = roll
        }
        this.roll
    }

    Student() {
        Student.count += 1
    }

    // instance methods
    // Method overriding
    Void displayDetails() {
        // current object ---> this
        super.displayDetails()
        println "\nRoll: ${this.roll}"
        // println "Name: ${name}\nGender: ${gender}\nRoll: ${roll}"
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
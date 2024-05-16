/*
>= 70 - A
>=60 < 70 - B
>=40 < 60 - C
< 40 - F
< 0 > 100 - I
 */

/* def calcGrade(marks) {
    if (marks < 0 || marks > 100) {
        "I"
    } else if (marks >= 70) {
        "A"
    } else if (marks >= 60) {
        "B"
    } else if (marks >= 40) {
        "C"
    } else {
        "F"
    }
} */

// Range -- (sequence of elements)
// range of numbers from 9 to 15 -- 9..15 -- (9,10,11,12,13,14,15)
// range of numbers from 9 to 15 not including 15 -- 9..<15 -- (9,10,11,12,13,14)

// in groovy switch case supports Range data

def calcGrade(marks) {
    switch (marks) {
        case 70..100: "A"
            break
        case 60..69: "B"
            break
        case 40..59: "C"
            break
        case 0..39: "F"
            break
        default: "I"
    }
}

println "The grade scored by you ${calcGrade(38)}" // GString



def marks = [4, 5, 4, 6, 10, 1, 2, 4]

// write logic to print all the even marks more than 2
// println "****** Even marks more than 2 ******"
/* for (def m in marks) {
    if (!(m % 2) && m > 2) {
        println m
    }
} */

// write logic to print only marks more than or equal to 5
// println "****** More than 5 marks ******"
/* for (def m in marks) {
    if (m > 5) {
        println m
    }
} */

// static part - iterating over each element of the list (repetitive)
// dynamic part - print even marks > 2 | print marks >= 5

// Functional programming
// higher order function
def forEach(elements, code) {
    for (def element in elements) {
        // dynamic code -- applied on `element`
        code(element)
    }
}

println "****** Even marks more than 2 ******"
// lower order functions
/* def evenMarksMoreThan2 = {m ->
    if (m % 2 == 0 && m > 2) {
        println m
    }
} */
/* forEach(marks) {m ->
    if (m % 2 == 0 && m > 2) {
        println m
    }
} */
/* forEach(marks) {
    // `it` implicit parameter available in a one argument closure
    if (it % 2 == 0 && it > 2) {
        println it
    }
} */
marks.each {
    if (it % 2 == 0 && it > 2) {
        println it
    }
}

println "****** More than 5 marks ******"
/* def moreThan5 = {m ->
    if (m > 5) {
        println m
    }
} */
/* forEach(marks) {
    if (it > 5) {
        println it
    }
} */ // will not work as functions are not treated as regular values

marks.each {
    if (it > 5) {
        println it
    }
}

// Closures
// def c1 = <<closure>>
// def c2 = << closure >>
// regular values
// accepts parameters, has a body, and returns a value











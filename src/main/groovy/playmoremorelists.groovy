def marks = [4, 5, 4, 6, 10, 1, 2, 4]

// write logic to build a new list, consisting of even marks more than 4 from the marks list
// filtering
/* def l1 = []
marks.each {
    if (it % 2 == 0 && it > 4) {
        l1 << it
    }
}
println l1 */

def l1 = marks.findAll {it % 2 == 0 && it > 4}
println l1

// to build a new list consisting of students who have either scored 10 marks or marks less than 4 from marks list
def l2 = marks.findAll {it == 10 || it < 4}
println l2

// write logic to build a new list consisting of elements from marks list but where each element marks
// is deducted by 1
// mapping
def l3 = marks.collect {it - 1}
println l3

// write logic to build a new list
// 1. filter out all odd marks
// 2. square all the odd marks
// filtering + mapping
def l4 = marks
        .findAll {it % 2 }
        .collect {it ** 2}
println l4

// write logic to check whether all the students have scored more than 4 marks or no
println marks.every {it > 4}

// sorting
def m = marks.sort(false)
println m
println marks

// descending
// def desc = marks.sort(false) {a, b -> b.compareTo(a)}
// Spaceship operator <=>
def desc = marks.sort(false) {a, b -> b <=> a}
println desc


def cars = ['audi', 'bmw', 'mercedes']
def m2 = cars.collect {it.capitalize()}
println m2
println m2.class
// iterating through every element and calling a function on it
// Spread of operator *.
def m3 = cars*.capitalize()
println m3
println m3.class

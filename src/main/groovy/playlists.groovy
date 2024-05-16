// List --- mutable
def marks = [4, 5, 4, 6, 10, 1, 2, 4]
def el = []
def cars = ['Audi', 'i10']
def s1 = ['mehul', 10, 'm'] // valid

// access
println marks[0]
println marks[-1]

marks[1] = 7
marks[-3] = 0
println marks

// iterate
for(def car in cars) {
    println car.toUpperCase()
}

// sublist
def nl = marks[0..3]
println nl
def nl2 = marks[-3..-1]
println nl2

// membership
println 0 in marks
println 'mercedes' in cars

// concatenation
def m1 = [4, 5, 1, 2]
def m2 = [1, 5, 10]
def m3 = m1 + m2
println m3
println m3.unique() // union of m1 and m2

// difference set
println m1 - m2
println m2 - m1

// intersection
println m1.intersect(m2)

// add a new element at the end of the list
cars << 'mercedes'
cars << 'porshe' << 'i20'
println cars
// remove element from the end of the list
println cars.removeLast()
println cars.removeLast()
println cars


// add a new element to the start of the list
cars.push('i20')
println cars
// remove an element from the start of the list
println cars.pop()
println cars

println marks.max()
println marks.min()
println marks.sum()
println marks.average()
println marks.count(4)

/* marks << 'mehul'
println marks */

def divisions = [
        [4, 5, 4, 2],
        [10, 3, 4, 6],
        [7, 8, 8, 10]
]
def allMarks = divisions.flatten()
println allMarks
println "Max marks across divisions is ${allMarks.max()}"




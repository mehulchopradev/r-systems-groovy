def m1 = [
        10: Tuple.tuple('mehul', 10, 'm'),
        23: Tuple.tuple('jane', 23, 'f'),
        45: Tuple.tuple('jill', 45, 'f')
]

// print Name: ....\nRoll: .... of only the female students from the above map
m1.each {roll, student ->
    if (student.v3 == 'f') {
        println "Name: $student.v1\nRoll: $roll"
    }
}

// to create a new map of only the female students from the m1 map
// filtering
def m2 = m1.findAll {roll, student -> student.v3 == 'f'}
println m2

// to create a new map having entry-value (roll-Jane) of only the female students from the m1 map
// filtering + mapping
def m3 = m1
        .findAll {roll, student -> student.v3 == 'f'}
        .collectEntries {roll, student -> [roll, student.v1.capitalize()]}
println m3

// count of all the distinct genders in m1 map
def m4 = m1.countBy {roll, student -> student.v3}
println m4

// group the m1 data by gender
def m5 = m1.groupBy {roll, student -> student.v3}
println m5

// to create a list of only the names of the students whose roll number is more than 10
def l1 = m1
    .findAll {roll, student -> roll > 10}
    .collect {roll, student -> student.v1}
println l1
// Tuple
// Heterogenous data
// Unlike a list, a tuple is immutable
// ordered

def s1 = Tuple.tuple('mehul', 10, 'm')

// access
println "Name is $s1.v1"
println "Gender is $s1.v3"

// s1.v1 = 'jane'

// s1.push('pune') // Unsupported operation exception
println s1

// iterate
for (def i in s1) {
    println i
}
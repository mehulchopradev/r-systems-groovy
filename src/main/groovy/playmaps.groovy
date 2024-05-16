// Map
// entries
    // key
    // value
// not ordered
// mutable

def m1 = [10: 'mehul', 23: 'jane', 45: 'jill']
println m1
println m1.getClass()

def m2 = [:]

// access
m1[22] = 'rahul'
println m1

m1[23] = 'tanya'
println m1

// membership
println 10 in m1
println 100 in m1

for(def entry in m1) {
    println "Name: $entry.value\nRoll: $entry.key"
}

println m1.size()
println m1.keySet()
println m1.values()
println m1.remove(23)
println m1.containsValue('mehul')
println m1.containsValue('tanya')

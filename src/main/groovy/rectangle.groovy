// def perimeterRectangle(length, breadth = 2) { 2 * (length + breadth) }

def perimeterRectangle(Map<String, Number> stats) {
    2 * (stats['length'] + stats['breadth'])
}

def areaRectangle(length, breadth) { length * breadth }

def statisticsRectangle(length, breadth) {
    Tuple.tuple perimeterRectangle(length, breadth), areaRectangle(length, breadth)
}

// println perimeterRectangle(3.2, 3.0)
// println perimeterRectangle(['length': 3.2, 'breadth': 3.0])
def p1 = perimeterRectangle 'length': 3.2, 'breadth': 3.0
println perimeterRectangle('breadth': 3.0, 'length': 3.2)

/* def l = 5
def b = 3

def peri = perimeterRectangle l, b
def ar = areaRectangle l, b

println "Perimeter is $peri"
println "Area is $ar"

def l2 = 10
def b2 = 2

def l3 = 12
def b3 = 2

println perimeterRectangle(l2)
println perimeterRectangle(l3)

println perimeterRectangle(5.2, 3.2)

def tup = statisticsRectangle(l, b)
println tup.v1
println tup.v2 */
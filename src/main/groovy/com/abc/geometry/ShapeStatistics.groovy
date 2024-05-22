package com.abc.geometry

// Vendor abc.com
class ShapeStatistics {

    static Void printStats(Shape shape) {
        println '*************************'
        println "Area is ${shape.area()}"
        println "Perimeter is ${shape.perimeter()}"
        println "*************************"
    }
}

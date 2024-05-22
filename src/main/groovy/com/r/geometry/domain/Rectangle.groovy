package com.r.geometry.domain

import com.abc.geometry.Shape

// Developer X
// implicitly extends Object
class Rectangle extends Shape {

    BigDecimal length
    BigDecimal breadth

    BigDecimal area() {
        this.length * this.breadth
    }

    BigDecimal perimeter() {
        2 * (this.length + this.breadth)
    }

    @Override
    String toString() {
        "length=${this.length} | breadth=${this.breadth}"
    }
}

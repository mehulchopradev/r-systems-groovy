package com.r.geometry.domain

import com.abc.geometry.Shape

// Developer Y
class Square extends Shape {

    BigDecimal side

    @Override
    BigDecimal area() {
        this.side ** 2
    }

    @Override
    BigDecimal perimeter() {
        4 * this.side
    }
}

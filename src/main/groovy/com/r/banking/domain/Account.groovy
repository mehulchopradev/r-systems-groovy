package com.r.banking.domain

// a - 100
// a + 500

class Account {
    Integer accNumber
    String accType
    BigDecimal balance

    BigDecimal minus(BigDecimal amt) {
        this.balance -= amt
    }

    BigDecimal plus(BigDecimal amt) {
        this.balance += amt
    }
}

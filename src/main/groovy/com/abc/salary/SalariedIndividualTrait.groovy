package com.abc.salary

trait SalariedIndividualTrait {
    abstract Integer getNoOfWorkingDays()
    abstract  BigDecimal getCommercialsPerDay()

    BigDecimal calculate() {
        def workingDays = this.getNoOfWorkingDays()
        def costPerDay = this.getCommercialsPerDay()

        def totalCost = workingDays * costPerDay
        def tds = 0.1 * totalCost
        totalCost - tds
    }
}
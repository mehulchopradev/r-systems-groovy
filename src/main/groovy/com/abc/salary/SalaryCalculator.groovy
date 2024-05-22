package com.abc.salary

class SalaryCalculator {

    static BigDecimal calculate(SalariedIndividual si) {
        def workingDays = si.getNoOfWorkingDays()
        def costPerDay = si.getCommercialsPerDay()

        def totalCost = workingDays * costPerDay
        def tds = 0.1 * totalCost
        totalCost - tds
    }
}

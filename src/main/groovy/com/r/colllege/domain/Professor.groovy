package com.r.colllege.domain

import com.abc.salary.SalariedIndividualTrait

// p << '3453453'
class Professor extends CollegeUser implements SalariedIndividualTrait {
    Integer noOfDaysInMonth
    BigDecimal perDayCost
    List<String> subjects

    @Override
    Integer getNoOfWorkingDays() {
        this.noOfDaysInMonth
    }

    @Override
    BigDecimal getCommercialsPerDay() {
        this.perDayCost
    }
}

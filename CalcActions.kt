package com.cis.calc2

sealed class CalcActions {
    data class Number(val number: Int) : CalcActions()
    object Calculate : CalcActions() //calculate action
    object Decimal : CalcActions() //Decimals
    object Delete : CalcActions() //clear current
    object Clear : CalcActions() //clear all
    data class Operation(val operation: CalcOperation) :
        CalcActions() //click events will attach to operation
}

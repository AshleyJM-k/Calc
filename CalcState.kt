package com.cis.calc2

data class CalcState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalcOperation? = null
)

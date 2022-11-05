package com.cis.calc2

sealed class CalcActions
data class Number(val number: Int): CalcActions()
object Calculate: CalcActions() //calculate action
object Decimal: CalcActions() //Decimals
object Clear: CalcActions() //clear current
object CompleteClear: CalcActions() //clear all
data class Operation()


package com.cis.calc2

sealed class CalcOperation(val symbol: String) {
    object Add: CalcOperation(symbol = "+")
    object Subtract: CalcOperation(symbol = "-")
    object Multiply: CalcOperation(symbol = "*")
    object Divide: CalcOperation(symbol = "/")
    object Modulus: CalcOperation(symbol = "%")
    object SquareRoot: CalcOperation(symbol = "X2")
}


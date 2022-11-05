package com.cis.calc2


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.work.Operation
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.text.font.FontWeight
import com.cis.calc2.ui.theme.Teal200


@ExperimentalComposeUiApi
@Composable
fun Calcutor(
    state: CalcState,
    modifier: Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalcActions) -> Unit
)
{
    Box(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing))
        {
            Text(
                text = state.number1 + (state.operation ?: "") + state.number2, //line of numbers
            textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2

            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalcButton(symbol = "Clear", //creates Clear all
                    modifier = Modifier
                        .background(Teal200)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalcActions.Clear)
                    }
                )
                CalcButton(symbol = "Clear", //creates Clear all
                    modifier = Modifier
                        .background(Teal200)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Clear)
                    }
                )
                CalcButton(symbol = "Divide", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Operation(CalcOperation.Divide))
                    }
                )

                }
            Row( //second row
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            )
            {
                CalcButton(
                    symbol = "9", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(7))
                    }
                )
                CalcButton(
                    symbol = "8", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(7))
                    }
                )
                CalcButton(
                    symbol = "7", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(7))
                    }
                )
                CalcButton(
                    symbol = "6", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(6))
                    }
                )
                CalcButton(
                    symbol = "5", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(5))
                    }
                )
                CalcButton(
                    symbol = "4", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(4))
                    }
                )
                CalcButton(
                    symbol = "3", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(3))
                    }
                )
                CalcButton(
                    symbol = "2", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(2))
                    }
                )
                CalcButton(
                    symbol = "1", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(1))
                    }
                )
                CalcButton(
                    symbol = "0", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Number(0))
                    }
                )
                CalcButton(
                    symbol = "*", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Operation(CalcOperation.Multiply))
                    }
                )
                CalcButton(
                    symbol = "-", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Operation(CalcOperation.Subtract))
                    }
                )
                CalcButton(
                    symbol = "+", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Operation(CalcOperation.Add))
                    }
                )
                CalcButton(
                    symbol = "*", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Operation(CalcOperation.Multiply))
                    }
                )
                CalcButton(
                    symbol = ".", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Decimal)
                    }
                )
                CalcButton(
                    symbol = "=", //creates Clear all
                    modifier = Modifier
                        .background(Color.Gray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalcActions.Calculate)
                    }
                )
            }
        }
    }
}
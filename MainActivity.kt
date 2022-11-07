package com.cis.calc2

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.fillMaxSize
import com.cis.calc2.ui.theme.Calc2Theme
import androidx.activity.ComponentActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.cis.calc2.ui.theme.Gray800


@ExperimentalComposeUiApi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calc2Theme {
                val viewModel = viewModel<CalcViewModel>()
                val state = viewModel.state
                val buttonSpacing = 6.dp
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.DarkGray)
                        .padding(16.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter),
                        verticalArrangement = Arrangement.spacedBy(buttonSpacing),
                    ) {
                        Text(
                            text = state.number1 + (state.operation?.symbol ?: " ") + state.number2,
                            textAlign = TextAlign.End,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 28.dp),
                            fontWeight = FontWeight.Light,
                            fontSize = 70.sp,
                            color = Color.Magenta,
                            maxLines = 1
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalcButton(
                                symbol = "AC",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Clear)
                            }
                            CalcButton(
                                symbol = "X2",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            )
                            {
                                viewModel.onAction(CalcActions.Operation(CalcOperation.SquareRoot))
                            }
                            CalcButton(
                                symbol = "Del",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Delete)
                            }
                            CalcButton(
                                symbol = "/",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Operation(CalcOperation.Divide))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalcButton(
                                symbol = "7",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(7))
                            }
                            CalcButton(
                                symbol = "8",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(8))
                            }
                            CalcButton(
                                symbol = "9",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(9))
                            }
                            CalcButton(
                                symbol = "*",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Operation(CalcOperation.Multiply))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalcButton(
                                symbol = "4",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(4))
                            }
                            CalcButton(
                                symbol = "5",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(5))
                            }
                            CalcButton(
                                symbol = "6",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(6))
                            }
                            CalcButton(
                                symbol = "-",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Operation(CalcOperation.Subtract))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalcButton(
                                symbol = "1",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(1))
                            }
                            CalcButton(
                                symbol = "2",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(2))
                            }
                            CalcButton(
                                symbol = "3",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(3))
                            }
                            CalcButton(
                                symbol = "+",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Operation(CalcOperation.Add))
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                        ) {
                            CalcButton(
                                symbol = "0",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Number(0))
                            }
                            CalcButton(
                                symbol = "%",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Operation(CalcOperation.Modulus))
                            }
                            CalcButton(
                                symbol = ".",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Decimal)
                            }
                            CalcButton(
                                symbol = "=",
                                color = Gray800,
                                modifier = Modifier
                                    .aspectRatio(1f)
                                    .weight(1f)
                            ) {
                                viewModel.onAction(CalcActions.Calculate)
                            }
                        }
                    }
                }
            }
        }
    }
}
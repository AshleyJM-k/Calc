package com.cis.calc2

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.viewModels
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


@ExperimentalComposeUiApi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calc2Theme {
                val viewModel= viewModels<CalcViewModel>()
                val state = viewModel.state
                val buttonSpacing = 8.dp
                Calcutor(state = state, onAction = viewModel::onAction,
                buttonSpacing = buttonSpacing,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
                    .padding(16.dp)
                )
             Box(modifier = Modifier
                 .fillMaxSize()
                 .background(Color.Black)
                 .padding(16.dp))
             {
                 Column {
                     modifier = Modifier
                         .fillMaxWidth()
                         .align(Alignment.BottomCenter),

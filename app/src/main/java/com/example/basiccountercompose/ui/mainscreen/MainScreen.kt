package com.example.basiccountercompose.ui.mainscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val viewModel = MainScreenViewModel()
    val myCounter = viewModel.myCounter.collectAsState()

    AnimatedButtons(
        myCounter,
        onDecreaseCounter = {
            viewModel.decrementCounterBy(it)
        },
        onIncreaseCounter = {
            viewModel.incrementCounterBy(it)
        },

        modifier = modifier
    )
}


@Composable
fun AnimatedButtons(
    myCounter: State<Int>,
    onIncreaseCounter: (Int) -> Unit,
    onDecreaseCounter: (Int) -> Unit,
    modifier: Modifier = Modifier
){

    Row(modifier = modifier.padding(8.dp)) {
        Button(
            onClick = { if (myCounter.value > 0) onDecreaseCounter(1) }
        ) {
            Text(text = "-")
        }

        Box(modifier = Modifier
            .clip(CircleShape)
            .padding(horizontal = 8.dp)){
            Button(onClick = { /*TODO*/ }) {
                Text(text = myCounter.value.toString())
            }
        }
        Button(onClick = { onIncreaseCounter(1) }) {
            Text(text = "+")
        }
    }
}


package com.example.basiccountercompose.ui.mainscreen

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainScreenViewModel: ViewModel() {

    private var _myCounter = MutableStateFlow(0)
    val myCounter: StateFlow<Int> = _myCounter.asStateFlow()

    fun incrementCounterBy(value: Int) {
        _myCounter.value += value
    }

    fun decrementCounterBy(value: Int) {
        _myCounter.value -= value
    }

}
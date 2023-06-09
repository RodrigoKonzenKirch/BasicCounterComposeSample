package com.example.basiccountercompose

import com.example.basiccountercompose.ui.mainscreen.MainScreenViewModel
import org.junit.Test
import org.junit.jupiter.api.Assertions

class MainScreenViewModelTest {

    // Object under test
    private val viewModel =  MainScreenViewModel()

    @Test
    fun testIncrementCounterByIncrementsByValuePassedAsParameter(){
        viewModel.incrementCounterBy(1)
        Assertions.assertEquals(1, viewModel.myCounter.value)

        viewModel.incrementCounterBy(2)
        Assertions.assertEquals(3, viewModel.myCounter.value)
    }

    @Test
    fun testDecrementCounterByDecrementsByValuePassedAsParameter(){

        viewModel.decrementCounterBy(1)
        Assertions.assertEquals(-1, viewModel.myCounter.value)

        viewModel.decrementCounterBy(2)
        Assertions.assertEquals(-3, viewModel.myCounter.value)

    }

}

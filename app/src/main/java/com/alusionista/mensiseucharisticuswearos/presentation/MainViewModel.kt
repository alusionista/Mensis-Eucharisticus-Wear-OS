package com.alusionista.mensiseucharisticuswearos.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alusionista.mensis_eucharisticus.models.TextModel
import java.util.*

class MainViewModel: ViewModel() {


    var isDarkTheme = mutableStateOf(false)

    private val calendar: Calendar = Calendar.getInstance()
    private val _day = MutableLiveData(calendar.get(Calendar.DAY_OF_MONTH))

    private val textModel = TextModel()

    val getTextByDay = mutableStateOf(textModel.getTextByDay(_day.value!!))

    val day: LiveData<Int> = _day

}
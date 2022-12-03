package com.alusionista.mensiseucharisticuswearos.presentation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.alusionista.mensiseucharisticuswearos.R
import com.alusionista.mensiseucharisticuswearos.presentation.components.MainUI

@Composable
fun MainView(viewModel: MainViewModel = viewModel()) {
    val day by viewModel.day.observeAsState(1)
    val getTextByDay by viewModel.getTextByDay
    val leaf = painterResource(R.drawable.light_leaf)

    MainUI(day, getTextByDay, leaf)

}


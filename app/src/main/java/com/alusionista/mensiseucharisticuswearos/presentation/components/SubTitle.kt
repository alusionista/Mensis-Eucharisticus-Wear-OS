package com.alusionista.mensiseucharisticuswearos.presentation.components

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.Text

@Composable
fun SubTitle(string: String) {
    Text(
        text = string,
        modifier = Modifier
            .padding(horizontal = 18.dp, vertical = 9.dp),
        fontStyle = FontStyle.Italic,
    )

}
package com.alusionista.mensiseucharisticuswearos.presentation.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.Card
import androidx.wear.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp

@Composable
fun PrepTextCard(bold: String, string: String) {

    Box{
        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(fontWeight = FontWeight.ExtraBold)) {
                    append(bold)
                }
                append(string)
            },
            modifier = Modifier
                .padding(18.dp)
        )
    }
    Spacer(Modifier.height(18.dp))
}
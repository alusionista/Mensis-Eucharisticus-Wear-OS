package com.alusionista.mensis_eucharisticus.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextCard(string: String) {

    Box {
        Text(
            text = string,
            modifier = Modifier
                .padding(18.dp)
        )
    }
    Spacer(Modifier.height(18.dp))
}
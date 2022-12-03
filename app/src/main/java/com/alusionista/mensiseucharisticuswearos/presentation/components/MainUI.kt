package com.alusionista.mensiseucharisticuswearos.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.focusTarget
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Text
import com.alusionista.mensis_eucharisticus.ui.components.TextCard

@Composable
fun MainUI(day: Int, getTextByDay: List<String>, leaf: Painter) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = ScrollState(0))
            .focusTarget(),
        //horizontalAlignment = Alignment.Start


    ) {
            Row(
                Modifier
                    .fillMaxWidth().padding(top = 18.dp),
                Arrangement.Center
            ) {
                Image(
                    modifier = Modifier
                        .width(50.dp)
                        .scale((-1).toFloat(), (1).toFloat())
                        .offset(y = 5.dp),
                    painter = leaf,
                    contentDescription = null
                )
                Text(
                    text = "Dia $day",
                    fontWeight = FontWeight.Bold,
                    fontStyle = FontStyle.Italic,
                )
                Image(
                    modifier = Modifier
                        .width(50.dp)
                        .offset(y = 5.dp),
                    painter = leaf,
                    contentDescription = null
                )
            }
            Spacer(Modifier.height(18.dp))

            SubTitle("Preparação")

            PrepTextCard("Quem vem? ", getTextByDay[0])
            PrepTextCard("A quem vem? ", getTextByDay[1])
            PrepTextCard("Por que vem? ", getTextByDay[2])

            SubTitle("Invocação")

            TextCard(getTextByDay[3])

            SubTitle("Ação de graças")

            TextCard(getTextByDay[4])
            TextCard(getTextByDay[5])
            TextCard(getTextByDay[6])

            SubTitle("Invocação")

            TextCard(getTextByDay[7])
        }
}
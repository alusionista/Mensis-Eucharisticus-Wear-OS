package com.alusionista.mensiseucharisticuswearos.presentation.theme

import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.Colors

val Red400 = Color(0xFFCF6679)
val Yellow = Color(0xFFFAC213)
val Dark = Color(0xFF222222)
val Light = Color(0xFFF3EFE0)
val Lighter = Color(0xFFFAF7EA)

internal val wearColorPalette: Colors = Colors(
    primary = Yellow,
    primaryVariant = Light,
    secondary = Lighter,
    secondaryVariant = Lighter,
    error = Red400,
    onPrimary = Dark,
    onSecondary = Dark,
    onError = Dark
)
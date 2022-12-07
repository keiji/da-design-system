package jp.go.digital.theme.compose

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Color.Sea300,
    primaryVariant = Color.Sea800,
    secondary = Color.Forest300
)

private val LightColorPalette = lightColors(
    primary = Color.Sea600,
    primaryVariant = Color.Sea900,
    secondary = Color.Forest300,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Sumi900,
    onBackground = Color.Sumi900,
    onSurface = Color.Sumi900,
)

@Composable
fun DaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}

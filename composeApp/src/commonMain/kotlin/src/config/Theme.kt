package src.config
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// This annotation is used to indicate that the function can be used in the composition of the UI
@Composable
fun AppTheme(
 content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = LightColorScheme.copy(),
        typography = Typography,
        content = content
    )
}
private val LightColorScheme= lightColorScheme(
    primary = Primary,
    secondary = Secondary,
    tertiary = Tertiary,
    background = White,
    surface = White,
    error = Red,
    onPrimary = White,
    onSecondary = White,
    onTertiary = White,
    onBackground =Black,
    onSurface = Black,
    onError = White,
    
)

private val Typography =Typography(
            displayLarge = TextStyle(
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 1.sp,
                color = Black 
            ),
            displayMedium = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp,
                color = Black
            ),
            displaySmall = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp,
                color = Black
            ),
            headlineLarge = TextStyle(
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp,
                color = White
            ),
            headlineMedium = TextStyle(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp,
                color = Black
            ),
            headlineSmall = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp,
                color = Black
            ),
            titleLarge = TextStyle(
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp,
                color = Black
            ),
            titleMedium = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp,
                color = Black
            ),
            titleSmall = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.sp,
                color = Black
            ),
            bodyLarge = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                letterSpacing = 0.sp,
                color = Black
            ),
            bodyMedium = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                letterSpacing = 0.sp,
                color = Black
            ),
            bodySmall = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Normal,
                letterSpacing = 0.sp,
                color = Black
            ),
            labelLarge = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                letterSpacing = 0.1.sp,
                color = DaryGrey
            ),
            labelMedium = TextStyle(
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                letterSpacing = 0.1.sp,
                color = DaryGrey
            ),
            labelSmall = TextStyle(
                fontSize = 10.sp,
                fontWeight = FontWeight.Medium,
                letterSpacing = 0.1.sp,
                color = LightGrey
            ),
        );




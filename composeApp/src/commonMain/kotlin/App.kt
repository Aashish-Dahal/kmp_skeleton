
import androidx.compose.runtime.*
import org.jetbrains.compose.ui.tooling.preview.Preview
import src.config.AppTheme
import src.pages.HomePage

@Composable
@Preview
fun App() {
    AppTheme {
     HomePage()
    }
}
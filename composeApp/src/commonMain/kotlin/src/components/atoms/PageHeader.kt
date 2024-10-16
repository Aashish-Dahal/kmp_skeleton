package src.components.atoms
import androidx.compose.material3.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import src.config.Primary
import src.config.Red

@ExperimentalMaterial3Api
@Composable

fun PageHeader(title: String) {
    TopAppBar(
        title = {
            Text(
                text = title,
                 style = MaterialTheme.typography.headlineLarge,
                softWrap = true
            )
        },
        colors= TopAppBarColors(
            containerColor = Primary,
            scrolledContainerColor =Primary ,
            titleContentColor = Primary,
            navigationIconContentColor = Primary,
            actionIconContentColor = Primary
        )


    )
}
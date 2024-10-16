package src.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import src.components.atoms.FloatingButton
import src.components.atoms.PageHeader

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage() {
    Scaffold(
        topBar = {PageHeader("Counter App")},
        floatingActionButton ={FloatingButton()}
        
    ) {
        Column {
            Text("Hello KMP")
            Text("Hello KMP")
            Text("Hello KMP")
            Text("Hello KMP")
            Text("Hello KMP")
            Text("Hello KMP")
            Text("Hello KMP")
            Text("Hello KMP")
            Text("Hello KMP")


        }
        
    }
    
}
package dev.keiji.dadesignsystem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.tooling.preview.Preview
import jp.go.digital.theme.compose.DaTheme

private val isJaLanguage = Locale.current.language == "ja"

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DaTheme(
                isJaLanguage = isJaLanguage,
            ) {
                Scaffold(
                    topBar = {
                        TopBar()
                    },
                    bottomBar = {},
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Surface(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(innerPadding),
                        color = MaterialTheme.colors.background
                    ) {
                        Greeting("Android")
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DaTheme {
        Greeting("Android")
    }
}

@Preview
@Composable
private fun TopBar(
) {
    TopAppBar(
        modifier = Modifier,
        title = { Text(stringResource(id = R.string.app_name)) },
        navigationIcon = {
            IconButton(
                onClick = {
                }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = null)
            }
        },
    )
}

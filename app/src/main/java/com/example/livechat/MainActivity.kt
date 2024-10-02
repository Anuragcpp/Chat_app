package com.example.livechat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.livechat.navigation.ChatAppNavigation
import com.example.livechat.ui.theme.LIveChatTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            LIveChatTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ChatAppNavigation()
                }
            }
        }
    }
}

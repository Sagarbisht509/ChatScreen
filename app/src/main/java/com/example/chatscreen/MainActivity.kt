package com.example.chatscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import com.example.chatscreen.model.Message
import com.example.chatscreen.ui.theme.ChatScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatScreenTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Conversation(msgList = messageList)
                }
            }
        }
    }
}

@Composable
fun Conversation(msgList: List<Message>) {
    LazyColumn {
        items(msgList) {
            MessageItem(msg = it)
        }
    }
}

//@Preview(
//    name = "Light Mode",
//    showSystemUi = true
//)
//@Preview(
//    name = "dark Mode",
//    uiMode = Configuration.UI_MODE_NIGHT_YES,
//    showSystemUi = true,
//)
//@Composable
//fun App() {
//    ChatScreenTheme {
//        Surface {
//            messageItem(msg = Message("author", "hii"))
//        }
//    }
//}

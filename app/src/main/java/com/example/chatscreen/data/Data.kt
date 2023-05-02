package com.example.chatscreen

import com.example.chatscreen.model.Message

var messageList = listOf(
    Message("Android", "Jetpack Compose provides an implementation of Material Design 3 and its UI elements out of the box."),
    Message("Android", "Material Design is built around three pillars: Color, Typography, and Shape"),
    Message("Android", "Note: the Empty Compose Activity template generates a default theme for your project that allows you to customize MaterialTheme. If you named your project anything different from ComposeTutorial, you can find your custom theme in the Theme.kt file in the ui.theme subpackage."),
    Message("Android", "Use MaterialTheme.colorScheme to style with colors from the wrapped theme. You can use these values from the theme anywhere a color is needed"),
    Message("Android", "Material Typography styles are available in the MaterialTheme, just add them to the Text composable."),
    Message("Android", "With Shape you can add the final touches. First, wrap the message body text around a Surface composable.")
)
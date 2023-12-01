package com.kaushalvasava.api.instagram.models

import kotlinx.serialization.Serializable

@Serializable
data class Chat(
    val senderImage: String,
    val receiverImage: String,
    val msgs: List<Message>,
)

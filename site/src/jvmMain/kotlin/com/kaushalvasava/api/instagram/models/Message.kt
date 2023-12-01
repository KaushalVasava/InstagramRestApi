package com.kaushalvasava.api.instagram.models

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val msg: String,
    val timeStamp: Long,
    val isSeen: Boolean = false,
    val userId: String,
)

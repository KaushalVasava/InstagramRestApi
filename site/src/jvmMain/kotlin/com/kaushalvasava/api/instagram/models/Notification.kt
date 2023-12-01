package com.kaushalvasava.api.instagram.models

import kotlinx.serialization.Serializable

@Serializable
data class Notification(
    val id: String,
    val image: String,
    val title: String,
    val timeDate: Long,
    val actionBy: String
)

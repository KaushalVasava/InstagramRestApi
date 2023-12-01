package com.kaushalvasava.api.instagram.models

import kotlinx.serialization.Serializable


@Serializable
data class Post(
    val id: String,
    val userId: String,
    val postImage: String,
    val caption: String,
    val likeCount: Int = 0
)

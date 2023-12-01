package com.kaushalvasava.api.instagram.models

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id: String,
    val name: String,
    val profileImage: String,
    val bio: String,
    val links: List<String>,
    val followerIds: List<String>,
    val followingIds: List<String>,
    val postIds: List<String>,
    val storyIds: List<String>
)

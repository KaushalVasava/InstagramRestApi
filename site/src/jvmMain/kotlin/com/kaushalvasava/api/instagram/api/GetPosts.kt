package com.kaushalvasava.api.instagram.api

import com.kaushalvasava.api.instagram.data.DataUtil.getPosts
import com.kaushalvasava.api.instagram.models.ApiResponse
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import jdk.jfr.ContentType
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Api(routeOverride = "posts")
suspend fun getPosts(context: ApiContext) {
    try {
        context.res.contentType = "application/json"
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.SuccessPost(getPosts())
            )
        )
    } catch (e: Exception) {
        context.res.contentType = "application/json"
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.Failed(e.message.toString())
            )
        )
    }
}
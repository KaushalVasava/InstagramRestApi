package com.kaushalvasava.api.instagram.api

import com.kaushalvasava.api.instagram.data.DataUtil
import com.kaushalvasava.api.instagram.models.ApiResponse
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Api(routeOverride = "notifications")
suspend fun getNotifications(context: ApiContext) {
    try {
        context.res.contentType = "application/json"
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.SuccessNotification(DataUtil.getNotifications())
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
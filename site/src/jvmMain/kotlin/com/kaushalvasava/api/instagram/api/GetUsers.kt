package com.kaushalvasava.api.instagram.api

import com.kaushalvasava.api.instagram.data.DataUtil.getUser
import com.kaushalvasava.api.instagram.models.ApiResponse
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Api(routeOverride = "users")
suspend fun getUsers(context: ApiContext) {
    try {
        val users = getUser()
        context.res.contentType = "application/json"
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.SuccessUser(users)
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
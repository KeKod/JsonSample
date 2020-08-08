package com.kekod.jsonsample.data

data class Content(
    val id: String,
    val thumbnailUrl: String,
    val contentBody: String,
    val contentType: String,
    val contentMediaSource: String,
    val publishDate: String,
    val isEdited: Boolean,
    val ownerInfo: User

)
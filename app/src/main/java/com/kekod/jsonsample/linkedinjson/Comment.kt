package com.kekod.jsonsample.linkedinjson

data class Comment(
    val authorId: String,
    val commentPersonPosition: String,
    val commentPersonTime: String,
    val content: String,
    val likesCount: Int
)
package com.kekod.jsonsample.linkedinjson


data class CommentModel(
    val authorid: Long,
    val content: String,
    val commentpersontime: Long,
    val commentpersonposition: String,
    val likescount: Int
)
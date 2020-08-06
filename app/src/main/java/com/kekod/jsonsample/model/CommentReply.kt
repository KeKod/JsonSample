package com.kekod.jsonsample.model

data class CommentReply(
    val user_name: String? = "",
    val user_comment: String? = "",
    val user_title: String? = "",
    val user_image_url: String? = "",
    val reply_diff_publish_now_time: String? = "",
    val reply_like_count: Int? = 0
)
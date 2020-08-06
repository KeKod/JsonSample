package com.kekod.jsonsample.model

data class Comment(
    val user_name: String? = "",
    val user_comment: String? = "",
    val user_title: String? = "",
    val user_image_url: String? = "",
    val comment_diff_publish_now_time: String? = "",
    val comment_like_count: Int? = 0,
    val comment_reply: List<CommentReply>? = null
)
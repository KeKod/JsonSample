package com.kekod.jsonsample.model

data class Post(
    val post_id: Int? = 0,
    val user_name: String? = "",
    val user_image_url: String? = "",
    val user_title: String? = "",
    val post_content: String? = "",
    val post_diff_publish_now_time: String? = "",
    val post_like_count: Int? = 0,
    val post_celebrate_count: Int? = 0,
    val post_support_count: Int? = 0,
    val post_wonderful_count: Int? = 0,
    val post_informative_count: Int? = 0,
    val post_video_url: String? = "",
    val post_image_url: String? = "",
    val is_post_have_video: Boolean? = false,
    val is_post_have_document: Boolean? = false,
    val is_post_have_url: Boolean? = false,
    val is_post_have_photo: Boolean? = false,
    val is_post_edit: Boolean? = false,
    val post_share_link: String? = "",
    val post_reactions: List<PostReaction>? = null,
    val post_comment: List<Comment>? = null


)
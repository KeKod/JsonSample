package com.kekod.jsonsample.linkedinjson

data class LinkedinModel(
    val authorid: Int,
    val authorname: String,
    val posttype: String,
    val authorposition: String,
    val content: ContentModel,
    val contentvideourl: String,
    val reactions: List<ReaktionModel>,
    val comments: List<CommentModel>,
    val authorImage: String,
    val postId: Long,
    val lastModified: Long,
    val publishedAt: Long,
    val title: String
)
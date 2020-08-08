package com.kekod.jsonsample.linkedinjson

data class LinkEdinModel(
    val authorId: Int,
    val followers: Long,
    val authorImage: String,
    val authorName: String,
    val authorPosition: String,
    val content: Content,
    val lastModified: Long,
    val postId: Long,
    val postType: String,
    val publishedAt: Long,
    val seenCount: Int,
    val title: String
)
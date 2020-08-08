package com.kekod.jsonsample.linkedinjson

data class Content(
    val comments: List<Comment>,
    val contentPhotos: List<String>,
    val contentText: String,
    val contentVideoUrl: String,
    val reactions: List<Reaction>
)
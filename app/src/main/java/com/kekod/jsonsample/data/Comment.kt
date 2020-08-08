package com.kekod.jsonsample.data

data class Comment(
    val id: String,
    val ownerId: String,
    val commentBody: String,
    val commentReaction: Reaction
)
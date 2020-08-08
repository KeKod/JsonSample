package com.kekod.jsonsample.linkedin.model

data class CommentDetails(
    private val reactionType: String,
    private val userConnectionType: Int,
    private val commentText: String,
    private val countReaction: Int,
    private val countComment: Int
) : User()
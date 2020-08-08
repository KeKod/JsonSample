package com.kekod.jsonsample.linkedin.model

data class CommentDetails(
    private val userId: Int,
    private val userName: String,
    private val userImageUrl: String,
    private val userDescription: String,
    private val userSubDescription: String,
    private val reactionType: String,
    private val userConnectionType: Int,
    private val comment: String,
    private val countLike: Int,
    private val countComment: Int
)
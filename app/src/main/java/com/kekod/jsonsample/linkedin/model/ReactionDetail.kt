package com.kekod.jsonsample.linkedin.model

data class ReactionDetail(
    private val reactionType: String,
    private val userId: Int,
    private val userName: String,
    private val userImageUrl: String,
    private val userDescription: String,
    private val userConnectionType: Int
)
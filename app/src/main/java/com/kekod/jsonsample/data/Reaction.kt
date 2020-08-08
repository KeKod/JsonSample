package com.kekod.jsonsample.data

data class Reaction(
    val likeCount: Int,
    val celebrationCount: Int,
    val giveSupportCount: Int,
    val wonderfulCount: Int,
    val informativeCount: Int,
    val curiousCount: Int,
    val comments: List<Comment>,
    val shareCount: Int
)

package com.kekod.jsonsample.linkedin.model

data class Post(
    private val header: Header,
    private val user: User,
    private val contentDescription: ContentDescription,
    private val reaction: Reaction,
    private val comments: Comment,
    private val countView: Int
)
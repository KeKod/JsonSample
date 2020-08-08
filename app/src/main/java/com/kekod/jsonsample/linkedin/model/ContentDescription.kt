package com.kekod.jsonsample.linkedin.model

data class ContentDescription(
    private val hasEdit: Boolean,
    private val descriptionText: String,
    private val hashtag: List<String>,
    private val url: String
)
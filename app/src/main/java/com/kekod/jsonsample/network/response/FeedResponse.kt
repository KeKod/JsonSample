package com.kekod.jsonsample.network.response

import com.kekod.jsonsample.data.Post

data class FeedResponse(
    val posts: List<Post> = emptyList()
)
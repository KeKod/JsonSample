package com.kekod.jsonsample.linkedin.response

import com.kekod.jsonsample.linkedin.model.Post

data class LinkedinPostResponse(
    private val data: List<Post>
)
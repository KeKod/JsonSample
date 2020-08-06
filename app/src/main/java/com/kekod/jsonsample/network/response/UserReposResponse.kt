package com.kekod.jsonsample.network.response

import com.kekod.jsonsample.data.RepoModel

data class UserReposResponse(
    val data: List<RepoModel>
)
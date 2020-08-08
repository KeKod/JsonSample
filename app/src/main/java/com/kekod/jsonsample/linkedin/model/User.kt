package com.kekod.jsonsample.linkedin.model

data class User(
    private val userId: Int,
    private val userName: String,
    private val userImageUrl: String,
    private val userDescription: String,
    private val userSubDescription: String
)
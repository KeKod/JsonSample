package com.kekod.jsonsample.data

data class User(
    val id: String,
    val username: String,
    val name: String,
    val surname: String,
    val profileImageUrl: String,
    val bio: String,
    val currentCompany: String,
    val contactInfo: Contact,
    val connections: List<User>,
    val isOpenToWork: Boolean
)
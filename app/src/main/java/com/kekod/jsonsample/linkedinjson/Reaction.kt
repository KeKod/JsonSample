package com.kekod.jsonsample.linkedinjson

data class Reaction(
    val commentPersonId: Int,
    val reactionPersonName: String,
    val reactionProfileUrl: String,
    val reactionType: String
)
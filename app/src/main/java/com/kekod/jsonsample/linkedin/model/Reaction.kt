package com.kekod.jsonsample.linkedin.model

data class Reaction(
    private val allReactionCount: Int,
    private val reactionLikeCount: Int,
    private val reactionClapCount: Int,
    private val reactionFavCount: Int,
    private val reactionDetails: List<ReactionDetail>
)
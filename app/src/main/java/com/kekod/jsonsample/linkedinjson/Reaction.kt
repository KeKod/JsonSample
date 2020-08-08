package com.kekod.jsonsample.linkedinjson

import com.kekod.jsonsample.linkedinjson.enum.ReactionType

/**     Code with ❤
╔════════════════════════════╗
║  Created by MasterKeko ║
╠════════════════════════════╣
║ sezginzgurr@gmail.com ║
╠════════════════════════════╣
║     08/08/2020 - 12:30     ║
╚════════════════════════════╝
 */

data class Reaction(
    val commentPersonId: Int,
    val reactionPersonName: String,
    val reactionProfileUrl: String,
    val reactionType: ReactionType
)
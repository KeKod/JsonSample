package com.kekod.jsonsample.linkedinjson


/**     Code with ❤
╔════════════════════════════╗
║  Created by MasterKeko ║
╠════════════════════════════╣
║ sezginzgurr@gmail.com ║
╠════════════════════════════╣
║     08/08/2020 - 12:30     ║
╚════════════════════════════╝
 */

data class Comment(
    val authorId: String,
    val commentPersonPosition: String,
    val commentPersonTime: String,
    val content: String,
    val likesCount: Int
)
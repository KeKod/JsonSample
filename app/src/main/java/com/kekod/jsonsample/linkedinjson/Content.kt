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

data class Content(
    val comments: List<Comment>,
    val contentPhotos: List<String>,
    val contentText: String,
    val contentVideoUrl: String,
    val reactions: List<Reaction>
)
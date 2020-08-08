package com.kekod.jsonsample.linkedinjson

import com.kekod.jsonsample.linkedinjson.enum.PostType

/**     Code with ❤
╔════════════════════════════╗
║  Created by MasterKeko ║
╠════════════════════════════╣
║ sezginzgurr@gmail.com ║
╠════════════════════════════╣
║     08/08/2020 - 12:30     ║
╚════════════════════════════╝
 */

data class LinkEdinModel(
    val authorId: Int,
    val followers: Long,
    val authorImage: String,
    val authorName: String,
    val authorPosition: String,
    val content: Content,
    val lastModified: Long,
    val postId: Long,
    val postType: PostType,
    val publishedAt: Long,
    val seenCount: Int,
    val title: String
)
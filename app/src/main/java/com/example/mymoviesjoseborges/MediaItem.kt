package com.example.mymoviesjoseborges

data class MediaItem(
    val id:Int,
    val title:String,
    val thumb:String,
    var type:Type
){
        enum class Type{PHOTO, VIDEO }
}

fun getMedia()=(1..10).map{
    MediaItem(
        id = it,
        title = "Title $it",
        thumb = "https://alfabetajuega.com/hero/2022/04/Este-villano-de-Naruto-podria-vencer-a-Goku-en-un-combate.jpg?width=1200&aspect_ratio=1200:631",
                type = if(it%3==0) MediaItem.Type.VIDEO else MediaItem.Type.PHOTO

    )
}

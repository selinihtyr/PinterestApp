package com.selin.pinterestapp.data.entity

import java.io.Serializable


data class Photos(var photo_id: Int,
                  var photo_text: String,
                  var photo_emoji: String,
                  var photo_name: String,
                  val card_height: Int,
                  var photo_image: String) : Serializable {

}
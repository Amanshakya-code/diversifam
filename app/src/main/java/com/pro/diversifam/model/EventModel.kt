package com.pro.diversifam.model

import java.io.Serializable

data class EventModel(
    val event_name: String,
    val event_description:String,
    val event_time:String,
    val event_organizer:String,
    val event_date : String,
    val event_location : String
) : Serializable
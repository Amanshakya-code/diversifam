package com.pro.diversifam.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.pro.diversifam.R
import com.pro.diversifam.model.EventModel

class EventsAdapter(
    private val data: List<EventModel>
): RecyclerView.Adapter<EventsAdapter.EventsViewHolder>(){

    inner class EventsViewHolder(val itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventsViewHolder {
        return EventsViewHolder(LayoutInflater.from(parent.context).
        inflate(R.layout.events_card_for_recycler, parent, false)
        )
    }

    override fun onBindViewHolder(holder: EventsViewHolder, position: Int) {
        val currentObject = data[position]

        holder.itemView.findViewById<TextView>(R.id.EventName_ttv).text = currentObject.event_name
        holder.itemView.findViewById<TextView>(R.id.EventOrganizerName_ttv).text = currentObject.event_organizer
        holder.itemView.findViewById<TextView>(R.id.EventDate_ttv).text = currentObject.event_date

    }

    private var onItemClickListener : ((EventModel) -> Unit)? = null

    fun setOnItemClickListener(listener: (EventModel) -> Unit){
        onItemClickListener = listener
    }

    override fun getItemCount(): Int {
        return data.size
    }

}
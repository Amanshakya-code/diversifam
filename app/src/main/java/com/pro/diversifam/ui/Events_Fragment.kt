package com.pro.diversifam.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.pro.diversifam.adapter.EventsAdapter
import com.pro.diversifam.databinding.FragmentEventsBinding
import com.pro.diversifam.model.EventModel


class Events_Fragment : Fragment() {

    private lateinit var eventsBinding:FragmentEventsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        eventsBinding = FragmentEventsBinding.inflate(inflater, container, false)

        val view = eventsBinding.root

        val data = EventModel("DiscoNight", "This will be a small party of 50 people and anyone who wants to come can come.", "5:00pm", "Anany Ladha", "16th January 2023", "Jaipur Y54 Sikar Road Rajasthan Suncity")
        val adapter : EventsAdapter = EventsAdapter(listOf(data))

        eventsBinding.EventsScreenRecycler.adapter = adapter
        eventsBinding.EventsScreenRecycler.layoutManager = LinearLayoutManager(activity)

        return view

    }

}
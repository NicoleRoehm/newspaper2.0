package com.example.recyclerwiederholung_news.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerwiederholung_news.R

class CommentAdapter (): RecyclerView.Adapter<CommentAdapter.ViewHolder>() {

    private var dataset = listOf<String>()

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val commentText = view.findViewById<TextView>(R.id.comment_text)
    }

    fun submitList(list: List<String>){
        dataset = list
        notifyItemInserted(dataset.lastIndex)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.comment_item, parent, false)

        return ViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val comments = dataset[position]

        holder.commentText.text = comments
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

}
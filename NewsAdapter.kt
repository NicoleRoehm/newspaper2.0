package com.example.recyclerwiederholung_news.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerwiederholung_news.R
import com.example.recyclerwiederholung_news.data.model.NewsArticle
import com.example.recyclerwiederholung_news.ui.HomeFragment
import com.example.recyclerwiederholung_news.ui.HomeFragmentDirections

class NewsAdapter(

) : RecyclerView.Adapter<NewsAdapter.ItemViewHolder>() {

    private var dataset = listOf<NewsArticle>()

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.news_title_text)
        val location: TextView = view.findViewById(R.id.news_location_text)
        val date: TextView = view.findViewById(R.id.news_date_text)
        val image: ImageView = view.findViewById(R.id.news_image)
        val card: CardView = view.findViewById(R.id.news_card)
    }

    fun submitList (list: List<NewsArticle>){

        dataset = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val itemLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_item, parent, false)

        return ItemViewHolder(itemLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val newsArticle: NewsArticle = dataset[position]

        holder.title.text = newsArticle.title
        holder.location.text = newsArticle.location
        holder.date.text = newsArticle.date
        holder.image.setImageResource(newsArticle.imageResourceId)

        holder.card.setOnClickListener {
            // TODO navigate
            holder.itemView.findNavController()
                .navigate(HomeFragmentDirections.actionHomeFragmentToDetailFragment(newsArticle.id))
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}

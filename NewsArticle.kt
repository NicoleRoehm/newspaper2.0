package com.example.recyclerwiederholung_news.data.model

data class NewsArticle(
    val id: Int,
    val title: String,
    val imageResourceId: Int,
    val location: String,
    val date: String,
    val article: String,
    val comments:MutableList<String>
)

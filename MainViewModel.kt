package com.example.recyclerwiederholung_news

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerwiederholung_news.data.Repository
import com.example.recyclerwiederholung_news.data.model.NewsArticle
import org.w3c.dom.Comment

class MainViewModel : ViewModel(){

    private val repository = Repository()

    private val _news = MutableLiveData<List<NewsArticle>>()
    val news: LiveData<List<NewsArticle>>
    get() = _news

    private val _commentList = MutableLiveData<MutableList<String>>()
    val commentList: LiveData<MutableList<String>>
    get() = _commentList


    fun loadComments(id:Int){
        val article = _news.value?.find { it.id == id }

        if (article != null){
            _commentList.value = article.comments
        }
    }

    fun addComment(comment: String){
        _commentList.value?.add(comment)
        _commentList.value = _commentList.value
    }

    init {
        _news.value = repository.loadNews()

    }
}
package com.example.recyclerwiederholung_news.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.recyclerwiederholung_news.MainViewModel
import com.example.recyclerwiederholung_news.adapter.CommentAdapter
import com.example.recyclerwiederholung_news.databinding.FragmentDetailBinding

class DetailFragment: Fragment() {

    private lateinit var binding: FragmentDetailBinding

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Todo Code
        val newsid = requireArguments().getInt("newsId")

        viewModel.loadComments(newsid)

        val commentAdapter = CommentAdapter()
        binding.detailCommentRecycler.adapter = commentAdapter


        viewModel.news.observe(viewLifecycleOwner){ list->

            val article = list.find { it.id == newsid }
            if (article != null){
                binding.detailImage.setImageResource(article.imageResourceId)
                binding.detailTitleText.text = article.title
                binding.detailDateText.text = article.date
                binding.detailArticleText.text = article.article
            }
        }

        viewModel.commentList.observe(viewLifecycleOwner){
            commentAdapter.submitList(it)
        }
        binding.detailCommentButton.setOnClickListener {
            val  newComment = binding.detailCommentEdit.text.toString()
            viewModel.addComment(newComment)
            binding.detailCommentEdit.setText("")
        }

    }
}
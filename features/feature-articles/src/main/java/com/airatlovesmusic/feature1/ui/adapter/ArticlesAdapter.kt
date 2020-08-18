package com.airatlovesmusic.feature1.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.airatlovesmusic.feature1.R
import com.airatlovesmusic.model.Article

class ArticlesAdapter(
    private val onClickListener: (Article) -> Unit
): RecyclerView.Adapter<ArticleHolder>() {

    private var list: List<Article> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_article, parent, false)
        return ArticleHolder(itemView)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ArticleHolder, position: Int) =
        holder.bind(list[position], onClickListener)

    fun updateList(list: List<Article>) {
        this.list = list
        notifyDataSetChanged()
    }


}
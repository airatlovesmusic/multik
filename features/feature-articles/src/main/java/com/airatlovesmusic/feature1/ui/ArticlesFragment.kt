package com.airatlovesmusic.feature1.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.airatlovesmusic.feature1.R
import com.airatlovesmusic.feature1.di.DaggerArticlesComponent
import com.airatlovesmusic.feature1.ui.adapter.ArticlesAdapter
import com.airatlovesmusic.global.base.BaseFragment
import com.airatlovesmusic.global.di.dependencies.findComponentDependencies
import kotlinx.android.synthetic.main.fragment_articles.*

class ArticlesFragment: BaseFragment<ArticlesViewModel>() {

    override val layoutRes: Int
        get() = R.layout.fragment_articles

    private val adapter by lazy { ArticlesAdapter { viewModel.goToArticle(it.url) } }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        observeViewModel()
    }

    private fun observeViewModel() {
        viewModel.list.observe(viewLifecycleOwner, Observer {
            adapter.updateList(it)
        })
    }

    private fun initRecycler() {
        rv_articles.layoutManager = LinearLayoutManager(context)
        rv_articles.adapter = adapter
        rv_articles.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
    }

    override fun inject() {
        DaggerArticlesComponent
            .factory()
            .create(this, findComponentDependencies())
            .inject(this)
    }

    override fun onBackPressed() {
        viewModel.goBack()
    }

}
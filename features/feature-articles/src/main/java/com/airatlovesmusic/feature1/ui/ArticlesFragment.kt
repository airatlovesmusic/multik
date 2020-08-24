package com.airatlovesmusic.feature1.ui

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.airatlovesmusic.feature1.R
import com.airatlovesmusic.feature1.di.Component
import com.airatlovesmusic.feature1.di.DaggerComponent
import com.airatlovesmusic.feature1.ui.adapter.ArticlesAdapter
import com.airatlovesmusic.global.base.BaseFragment
import com.airatlovesmusic.global.di.findComponentDependencies
import kotlinx.android.synthetic.main.fragment_articles.*
import javax.inject.Inject

class ArticlesFragment: BaseFragment() {

    @Inject lateinit var viewModel: ArticlesViewModel

    init {
        componentBuilder = {
            DaggerComponent.factory()
                .create(this, findComponentDependencies())
        }
    }

    override val layoutRes: Int
        get() = R.layout.fragment_articles

    private val adapter by lazy {
        ArticlesAdapter { viewModel.goToArticle(it.url) }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        getComponent<Component>().inject(this)
        super.onCreate(savedInstanceState)
    }

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

}
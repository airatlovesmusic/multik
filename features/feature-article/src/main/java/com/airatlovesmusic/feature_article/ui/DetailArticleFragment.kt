package com.airatlovesmusic.feature_article.ui

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import com.airatlovesmusic.feature_article.R
import com.airatlovesmusic.feature_article.di.Component
import com.airatlovesmusic.feature_article.di.DaggerComponent
import com.airatlovesmusic.global.base.BaseFragment
import com.airatlovesmusic.global.di.findComponentDependencies
import kotlinx.android.synthetic.main.fragment_article_detail.*
import javax.inject.Inject

class DetailArticleFragment: BaseFragment() {

    override val layoutRes: Int
        get() = R.layout.fragment_article_detail

    init {
        componentBuilder = {
            DaggerComponent
                .factory()
                .create(this, url, findComponentDependencies())
        }
    }

    @Inject lateinit var viewModel: DetailArticleViewModel

    private val url by lazy { requireArguments().getString(ARG_URL, "") }

    override fun initComponent() {
        getComponent<Component>().inject(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.article.observe(viewLifecycleOwner, Observer {
            tv_text.text = it.title
        })
    }

    override fun onBackPressed() {
        viewModel.goBack()
    }

    companion object {
        fun create(url: String) = DetailArticleFragment().apply {
            arguments = bundleOf(
                ARG_URL to url
            )
        }
        const val ARG_URL = "url"
    }

}
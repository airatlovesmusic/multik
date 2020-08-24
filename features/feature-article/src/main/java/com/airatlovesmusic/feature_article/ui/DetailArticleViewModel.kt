package com.airatlovesmusic.feature_article.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.airatlovesmusic.global.base.BaseViewModel
import com.airatlovesmusic.global.interfaces.ArticlesRepository
import com.airatlovesmusic.model.Article
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class DetailArticleViewModel @Inject constructor(
    private val articlesRepository: ArticlesRepository,
    private val router: ArticleRouter,
    private val url: String
): BaseViewModel() {

    val article = MutableLiveData<Article>().apply {
        viewModelScope.launch(Dispatchers.IO) {
            postValue(articlesRepository.getArticle(url))
        }
    }

    fun goBack() = router.goBack()

}
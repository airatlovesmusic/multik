package com.airatlovesmusic.feature1.ui

import androidx.lifecycle.MutableLiveData
import com.airatlovesmusic.global.base.BaseViewModel
import androidx.lifecycle.viewModelScope
import com.airatlovesmusic.global.data.system.FlowRouter
import com.airatlovesmusic.global.interfaces.ArticlesRepository
import com.airatlovesmusic.model.Article
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class ArticlesViewModel @Inject constructor(
    private val articlesRepository: ArticlesRepository,
    private val router: ArticlesRouter
): BaseViewModel() {

    val list = MutableLiveData<List<Article>>().apply {
        viewModelScope.launch(Dispatchers.IO) {
            postValue(articlesRepository.getArticles())
        }
    }

    fun goToArticle(url: String) =
        router.openDetailArticle(url)


}
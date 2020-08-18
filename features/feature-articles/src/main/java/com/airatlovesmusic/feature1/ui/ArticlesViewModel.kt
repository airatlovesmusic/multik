package com.airatlovesmusic.feature1.ui

import androidx.lifecycle.MutableLiveData
import com.airatlovesmusic.global.base.BaseViewModel
import androidx.lifecycle.viewModelScope
import com.airatlovesmusic.global.interfaces.AppRouter
import com.airatlovesmusic.global.interfaces.ArticlesRepository
import com.airatlovesmusic.model.Article
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class ArticlesViewModel @Inject constructor(
    private val articlesRepository: ArticlesRepository,
    private val router: AppRouter
): BaseViewModel() {

    val list = MutableLiveData<List<Article>>().apply {
        viewModelScope.launch(Dispatchers.IO) {
            postValue(articlesRepository.getArticles())
        }
    }

    fun goBack() =
        router.goBack()

    fun goToArticle(url: String) =
        router.goToArticle(url)


}
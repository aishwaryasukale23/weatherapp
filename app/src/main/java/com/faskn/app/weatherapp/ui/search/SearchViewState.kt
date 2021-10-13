package com.faskn.app.weatherapp.ui.search

import com.faskn.app.weatherapp.core.BaseViewState
import com.faskn.app.weatherapp.db.entity.CitiesForSearchEntity
import com.faskn.app.weatherapp.utils.domain.Status



class SearchViewState(
    val status: Status,
    val error: String? = null,
    val data: List<CitiesForSearchEntity>? = null
) : BaseViewState(status, error) {
    fun getSearchResult() = data
}

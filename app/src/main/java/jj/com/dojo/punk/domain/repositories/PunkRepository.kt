package jj.com.dojo.punk.domain.repositories

import jj.com.dojo.punk.domain.entities.Beer
import jj.com.dojo.punk.domain.utils.Result

interface PunkRepository {

    fun getBeersById(id: Int)
            : Result<List<Beer>>

    fun getBeersList(page: Int, perPage: Int)
            : Result<List<Beer>>

    fun getSearchBeer(
        beerName: String,
        page: Int,
        perPage: Int
    )
            : Result<List<Beer>>
}
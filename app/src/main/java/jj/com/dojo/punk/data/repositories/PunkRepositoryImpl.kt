package jj.com.dojo.punk.data.repositories

import jj.com.dojo.punk.data.service.PunkService
import jj.com.dojo.punk.domain.entities.Beer
import jj.com.dojo.punk.domain.repositories.PunkRepository
import jj.com.dojo.punk.domain.utils.Result

class PunkRepositoryImpl(
    private val punkService: PunkService
) : PunkRepository {

    override fun getBeersById(id: Int): Result<List<Beer>> {
        return punkService.getBeersById(id)
    }

    override fun getBeersList(page: Int, perPage: Int): Result<List<Beer>> {
        return punkService.getBeersList(page, perPage)
    }

    override fun getSearchBeer(beerName: String, page: Int, perPage: Int): Result<List<Beer>> {
        return punkService.getSearchBeer(beerName, page, perPage)
    }
}
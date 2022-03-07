package jj.com.dojo.punk.domain.useCases

import jj.com.dojo.punk.domain.repositories.PunkRepository
import org.koin.core.KoinComponent

class GetSearchBeer(private val punkRepository: PunkRepository) : KoinComponent {

    operator fun invoke(beerName: String, page: Int, perPage: Int) =
        punkRepository.getSearchBeer(beerName, page, perPage)
}
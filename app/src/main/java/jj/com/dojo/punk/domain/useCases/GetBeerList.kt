package jj.com.dojo.punk.domain.useCases

import jj.com.dojo.punk.domain.repositories.PunkRepository
import org.koin.core.KoinComponent

class GetBeerList(private val punkRepository: PunkRepository) : KoinComponent {

    operator fun invoke(page: Int, perPage: Int) = punkRepository.getBeersList(page, perPage)
}
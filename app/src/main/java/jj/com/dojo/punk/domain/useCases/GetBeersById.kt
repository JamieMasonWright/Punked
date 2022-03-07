package jj.com.dojo.punk.domain.useCases

import jj.com.dojo.punk.domain.repositories.PunkRepository
import org.koin.core.KoinComponent


class GetBeersById (private val punkRepository: PunkRepository) : KoinComponent{

    operator fun invoke(id: Int) = punkRepository.getBeersById(id)
}
package jj.com.dojo.punk.di

import android.content.Context
import android.content.SharedPreferences
import jj.com.dojo.punk.data.repositories.PunkRepositoryImpl
import jj.com.dojo.punk.data.service.PunkService
import jj.com.dojo.punk.domain.repositories.PunkRepository
import jj.com.dojo.punk.domain.useCases.GetBeerList
import jj.com.dojo.punk.domain.useCases.GetBeersById
import jj.com.dojo.punk.domain.useCases.GetSearchBeer
import jj.com.dojo.punk.ui.utils.SharedPreferencesConfig
import jj.com.dojo.punk.ui.viewmodels.PunkViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val repositoriesModule = module {
    single { PunkService() }
    single<PunkRepository> { PunkRepositoryImpl(get()) }
}

val viewModelModule = module {
    single { PunkViewModel(get(), get(), get(), get()) }
}

val useCasesModule = module {
    single { GetBeersById(get()) }
    single { GetBeerList(get()) }
    single { GetSearchBeer(get()) }
}

val sharedPreferences = module {

    single { SharedPreferencesConfig(androidContext())}

    single {
        getSharedPrefs(androidContext(), "com.example.android.PREFERENCE_FILE")
    }

    single<SharedPreferences.Editor> {
        getSharedPrefs(androidContext(), "com.example.android.PREFERENCE_FILE").edit()
    }
}

fun getSharedPrefs(context: Context, fileName: String): SharedPreferences {
    return context.getSharedPreferences(fileName, Context.MODE_PRIVATE)
}
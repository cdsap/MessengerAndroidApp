package com.awesomeapp.setting

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.search.Api12_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.identity.Api4_6


@Singleton
class Repository20_5 @Inject constructor(
    private val api0: Api12_6,
    private val api1: Api8_6,
    private val api2: Api4_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
        coroutineScope {
    val apis = listOf<suspend () -> String>(
        { api0.fetchData() },
        { api1.fetchData() },
        { api2.fetchData() }
    )
    val results = apis.map { fetcher ->
        async { fetcher() }
    }.awaitAll()
    results.joinToString("")
}
    }
}
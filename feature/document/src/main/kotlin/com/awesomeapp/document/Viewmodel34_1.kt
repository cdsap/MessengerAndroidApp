package com.awesomeapp.document

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.search.Repository12_5
import com.awesomeapp.profile.Repository8_5
import com.awesomeapp.identity.Repository4_5


@HiltViewModel
class Viewmodel34_1 @Inject constructor(
    private val repository0: Repository12_5,
    private val repository1: Repository8_5,
    private val repository2: Repository4_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = coroutineScope {
    val fetchers = listOf<suspend () -> String>(
        { repository0.getData() },
        { repository1.getData() },
        { repository2.getData() }
    )
    val results = fetchers.map { fetch ->
        async { fetch() }
    }.awaitAll()
    results.joinToString("")
}
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}
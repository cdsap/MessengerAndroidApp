package com.awesomeapp.app

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
import com.awesomeapp.usercontact.Repository56_5
import com.awesomeapp.postcontact.Repository60_5
import com.awesomeapp.synccontact.Repository64_5
import com.awesomeapp.notificationcontact.Repository68_5
import com.awesomeapp.analyticscontact.Repository72_5
import com.awesomeapp.metriccontact.Repository76_5


@HiltViewModel
class Viewmodel80_1 @Inject constructor(
    private val repository0: Repository56_5,
    private val repository1: Repository60_5,
    private val repository2: Repository64_5,
    private val repository3: Repository68_5,
    private val repository4: Repository72_5,
    private val repository5: Repository76_5
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
        { repository2.getData() },
        { repository3.getData() },
        { repository4.getData() },
        { repository5.getData() }
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
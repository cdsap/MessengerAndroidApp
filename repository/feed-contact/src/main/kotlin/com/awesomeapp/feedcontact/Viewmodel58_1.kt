package com.awesomeapp.feedcontact

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.forecast.Repository40_5


@HiltViewModel
class Viewmodel58_1 @Inject constructor(
    private val repository0: Repository40_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = repository0.getData()
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: " + e.message)
            }
        }
    }
}
package com.example.panalsuite.viewmodel

import androidx.lifecycle.ViewModel
import com.example.panalsuite.model.MenuItem
import com.example.panalsuite.repository.menuRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel(
    private val repository: menuRepository = menuRepository()
): ViewModel(){
    private val _menuItems = MutableStateFlow<List<MenuItem>>(emptyList())
    val menuItem: StateFlow<List<MenuItem>> = _menuItems.asStateFlow()
}
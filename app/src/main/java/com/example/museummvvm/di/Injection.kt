package com.example.museummvvm.di

import androidx.lifecycle.ViewModelProvider
import com.example.museummvvm.model.MuseumDataSource
import com.example.museummvvm.model.MuseumRepository
import com.example.museummvvm.viewmodel.ViewModelFactory

object Injection {

    private val museumDataSource:MuseumDataSource = MuseumRepository()
    private val museumViewModelFactory = ViewModelFactory(museumDataSource)

    fun providerRepository(): MuseumDataSource {
        return museumDataSource
    }

    fun provideViewModelFactory(): ViewModelProvider.Factory{
        return museumViewModelFactory
    }
}
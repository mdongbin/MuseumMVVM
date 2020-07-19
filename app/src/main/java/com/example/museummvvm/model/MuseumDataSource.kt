package com.example.museummvvm.model

import com.example.museummvvm.data.OperationCallback

interface MuseumDataSource {

    fun retrieveMuseums(callback: OperationCallback<Museum>)
    fun cancel()
}
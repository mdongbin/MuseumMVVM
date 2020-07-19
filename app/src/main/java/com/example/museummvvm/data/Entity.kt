package com.example.museummvvm.data

import com.example.museummvvm.model.Museum


data class MuseumResponse(val status:Int?,val msg:String?,val data:List<Museum>?){
    fun isSuccess():Boolean= (status==200)
}
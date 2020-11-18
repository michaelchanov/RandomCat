package com.example.randomcat.data

import retrofit2.Call
import retrofit2.http.GET

interface CatApi {
    @GET
        ("/v1/images/search")
    fun getData(): Call<CatData>
}
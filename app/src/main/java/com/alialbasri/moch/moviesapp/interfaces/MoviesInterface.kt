package com.alialbasri.moch.moviesapp.interfaces

import com.alialbasri.moch.moviesapp.models.SearchResult
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MoviesInterface {

//    @GET("location/{id}/")
//    fun getCityInfo(@Path("id") cityId:Int): Call<City>

    @GET("?apikey={apikey}&")
    fun searchForMovie(@Path("apikey") apiKey: String, @Query("s") searchQuery: String): Call<SearchResult>


}
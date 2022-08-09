package com.rafif.getapiwithquery.network

import com.rafif.getapiwithquery.data.Users
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("search/users")
    fun searchUser(@Query("q") username: String) : Call<Users>
}
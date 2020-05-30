package com.mehmetsaitisik.youtubeplaylist

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
//GET https://www.googleapis.com/youtube/v3/playlists?part=snippet&channelId=UCC0XKbXvSaON1OiiyN-0J7A&key=[YOUR_API_KEY] HTTP/1.1
    @GET("playlists?part=snippet")
    fun tumListeleriGetir(@Query("ChannelId")channelId:String,@Query("key")apiKey:String, @Query("maxResult")limit:Int):Call<Youtubeplaylist>

}
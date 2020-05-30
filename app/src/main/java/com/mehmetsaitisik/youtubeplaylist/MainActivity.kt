package com.mehmetsaitisik.youtubeplaylist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Response
import java.util.*
import javax.security.auth.callback.Callback
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    val API_KEY="AIzaSyDkcKRGVT59am_K508PjpqRNEuaO6kN4PA"
    val CHANNEL_ID="UCC0XKbXvSaON1OiiyN-0J7A"
    var gelenVeri:Youtubeplaylist?=null
    var oynatmaListeleri:List<Item>?=null
    var myAdapter:PlaylistAdapter?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var apiInterface=ApiClient.client?.create(ApiInterface::class.java)
        var apiCall=apiInterface?.tumListeleriGetir(CHANNEL_ID,API_KEY,25)

        apiCall?.enqueue(object : retrofit2.Callback<Youtubeplaylist>{

            override fun onResponse(call: Call<Youtubeplaylist>, response: Response<Youtubeplaylist>) {
                Log.e("BAŞARILI",call?.request()?.url()?.toString())



                gelenVeri=response?.body()
                oynatmaListeleri=gelenVeri?.items
                myAdapter= PlaylistAdapter(oynatmaListeleri)
                recyclerviewPlaylist.adapter=myAdapter

                var mylayoutManager=LinearLayoutManager(this@MainActivity,LinearLayoutManager.VERTICAL,false)
                recyclerviewPlaylist.layoutManager=mylayoutManager
                supportActionBar?.setSubtitle("Toplam Liste Sayısı :"+oynatmaListeleri?.size)

                Log.e("BAŞARILI:","TOPLAM ELEMAN SAYISI"+oynatmaListeleri?.size)

            }


            override fun onFailure(call: Call<Youtubeplaylist>, t: Throwable) {

                Log.e("HATA"," "+t?.printStackTrace())

            }


        })




    }
}

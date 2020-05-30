package com.mehmetsaitisik.youtubeplaylist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.tek_satir_playlist.view.*

class PlaylistAdapter(tumOynatmaListeleri:List<Item>?): RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder>() {
    var oynatmaListeleri=tumOynatmaListeleri

    override fun getItemCount(): Int {
        return oynatmaListeleri!!.size
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {

        var inflater=LayoutInflater.from(parent?.context)
        var tekSatirPlaylist=inflater.inflate(R.layout.tek_satir_playlist,parent,false)

        return PlaylistViewHolder(tekSatirPlaylist)
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {

        var oanOlusturulanSatir=oynatmaListeleri?.get(position)
        holder?.setData(oanOlusturulanSatir!!,position)
    }



    inner class PlaylistViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        var tekSatirPlaylist=itemView as CardView
        var playListTitle=tekSatirPlaylist.tvListeBaslik
        var playListImage=tekSatirPlaylist.circleImageView


        fun setData(oanOlustuulanSatir:Item,pos:Int){

            playListTitle.text=oanOlustuulanSatir?.snippet?.title
            Picasso.with(tekSatirPlaylist.context).load(oanOlustuulanSatir?.snippet?.thumbnails?.high?.url).into(playListImage)

        }

    }
}


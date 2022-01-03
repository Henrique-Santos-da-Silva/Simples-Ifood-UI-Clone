package com.youtube.tutorial.ifoodclone

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.squareup.picasso.Picasso
import com.youtube.tutorial.ifoodclone.databinding.BannerItemBinding
import com.youtube.tutorial.ifoodclone.model.Banner

class BannerView (viewGroup: ViewGroup): ATViewHolder<Banner, BannerItemBinding>(BannerItemBinding::inflate, viewGroup) {
    override fun bind(item: Banner) {
        Picasso.get().load(item.bannerUrl).into(binding.imgBanner)
    }
}
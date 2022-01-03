package com.youtube.tutorial.ifoodclone

import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.squareup.picasso.Picasso
import com.youtube.tutorial.ifoodclone.databinding.BannerItemBinding
import com.youtube.tutorial.ifoodclone.databinding.ShopItemBinding
import com.youtube.tutorial.ifoodclone.model.Banner
import com.youtube.tutorial.ifoodclone.model.Shop

class ShopView (viewGroup: ViewGroup): ATViewHolder<Shop, ShopItemBinding>(ShopItemBinding::inflate, viewGroup) {
    override fun bind(item: Shop) {
        binding.txtShop.text = item.text
        Picasso.get().load(item.bannerUrl).into(binding.imgShop)
    }
}
package com.youtube.tutorial.ifoodclone

import android.graphics.drawable.GradientDrawable
import android.view.ViewGroup
import co.tiagoaguiar.atway.ui.adapter.ATViewHolder
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import com.youtube.tutorial.ifoodclone.databinding.CategoryItemBinding
import com.youtube.tutorial.ifoodclone.model.Category
import java.lang.Exception

class CategoryView(viewGroup: ViewGroup): ATViewHolder<Category, CategoryItemBinding>(CategoryItemBinding::inflate, viewGroup) {
    override fun bind(item: Category) {
        binding.txtCategory.text = item.name

        Picasso.get().load(item.logoUrl).into(binding.imgCategory, object: Callback {
            override fun onSuccess() {
                val shape = GradientDrawable()
                shape.cornerRadius = 10f
                shape.setColor(item.color.toInt())

                binding.bgCategory.background = shape
            }

            override fun onError(e: Exception?) {
            }

        })
    }
}
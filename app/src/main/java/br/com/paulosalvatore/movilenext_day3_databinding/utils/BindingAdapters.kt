package br.com.paulosalvatore.movilenext_day3_databinding.utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

object BindingAdapters {
	@JvmStatic @BindingAdapter("image")
	fun loadImage(imageView: ImageView, imageUrl: String?) {
		Glide.with(imageView.context).load(imageUrl).into(imageView)
	}
}

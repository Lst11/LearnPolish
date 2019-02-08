package com.lst11.learnpolish.presentation.utils.databinder

import android.databinding.BindingAdapter
import android.view.View
import android.widget.ImageView
import com.lst11.learnpolish.R

@BindingAdapter("android:visibility")
fun View.visibility(visibility: Boolean) {
    this.visibility = if (visibility) View.VISIBLE else View.INVISIBLE
}

@BindingAdapter("app:srcCompat")
fun setImage(imageView: ImageView, isPressed: Boolean) {
    if (isPressed) imageView.setImageResource(R.drawable.ic_star)
    else imageView.setImageResource(R.drawable.ic_star_border)
}

//@BindingAdapter("android:state_pressed")
//fun View.isPressed(isPressed: Boolean) {
//    this.isPressed = isPressed
//}


//@BindingAdapter("android:src")
//fun loadImage(imageView: ImageView, url: String) {
//    Picasso.get()
//            .load(url)
//            .transform(CircularTransformation())
//            .into(imageView)
//}
//@BindingAdapter("text")
//fun TextView.view(text : Int){
//    this.text = text.toString()
//}

//class BottomNavigationViewBindingAdapter {
//    @BindingAdapter("app:onClickItem")
//    fun setOnNavigationItemSelectedListener(
//            view: BottomNavigationView, listener: BottomNavigationView.OnNavigationItemSelectedListener) {
//        view.setOnNavigationItemSelectedListener(listener)
//    }
//}
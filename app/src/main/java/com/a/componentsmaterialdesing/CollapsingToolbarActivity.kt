package com.a.componentsmaterialdesing

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.palette.graphics.Palette
import kotlinx.android.synthetic.main.activity_collapsing_toolbar.*

/**
 * https://www.youtube.com/watch?v=WLy4lzLt0ts
 */
class CollapsingToolbarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_toolbar)

        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val bitmap =  BitmapFactory.decodeResource(resources, R.drawable.ferrari )
//        Palette.from(bitmap).generate( Palette.PaletteAsyncListener {
//            if(it != null){
//                collapsing_toolbar.setContentScrimColor(it.getMutedColor(R.attr.colorPrimary))
//            }
//        })

    }
}

package com.a.componentsmaterialdesing.animations.listanimationsliderigth

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a.componentsmaterialdesing.R
import kotlinx.android.synthetic.main.activity_animations.*
import kotlinx.android.synthetic.main.activity_recycler_view_animation_slide_right.*
/**
 * https://www.youtube.com/watch?v=xyyxu1v-CZE
 */
class RecyclerViewAnimationSlideRightActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_animation_slide_right)
       val listItems = ArrayList<NewsItem>()

        for ( item in 0..15){
         listItems.add(NewsItem("News Item ${item}", "Teste"))
        }

        news_recyclerview.adapter = NewsItemsAdapter(listItems)
    }
}

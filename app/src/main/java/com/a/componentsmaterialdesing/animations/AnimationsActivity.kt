package com.a.componentsmaterialdesing.animations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a.componentsmaterialdesing.R
import com.a.componentsmaterialdesing.animations.listanimationsliderigth.RecyclerViewAnimationSlideRightActivity
import com.a.componentsmaterialdesing.animations.lottieanimations.LottieAnimationsActivity
import kotlinx.android.synthetic.main.activity_animations.*

class AnimationsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animations)

        list_slide_rigth.setOnClickListener {
            val intent = Intent(this, RecyclerViewAnimationSlideRightActivity::class.java)
            startActivity(intent)
        }

        lottie_animations.setOnClickListener {
            val intent = Intent(this, LottieAnimationsActivity::class.java)
            startActivity(intent)
        }

    }
}

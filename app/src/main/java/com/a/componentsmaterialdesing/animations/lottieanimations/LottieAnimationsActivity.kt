package com.a.componentsmaterialdesing.animations.lottieanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a.componentsmaterialdesing.R
import kotlinx.android.synthetic.main.activity_lottie_animations.*
/**
 * https://www.youtube.com/watch?v=n7XTizCon0A
 * https://lottiefiles.com/search?q=pay&category=animations&animations-page=3
 */
class LottieAnimationsActivity : AppCompatActivity() {

    private var isCheckedDone = false
    private var isSwitchOn = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lottie_animations)

        lottie_checked_done.setOnClickListener {
            if (isCheckedDone) {
                lottie_checked_done.speed = -1F
                lottie_checked_done.playAnimation()
                isCheckedDone = false
            } else {
                lottie_checked_done.speed = 1F
                lottie_checked_done.playAnimation()
                isCheckedDone = true
            }
        }
        lottie_switch.speed = 2f
        lottie_switch.setOnClickListener {
            if (isSwitchOn) {
                lottie_switch.setMinAndMaxProgress(0.5f, 1.0f)
                lottie_switch.playAnimation()
                isSwitchOn = false
            } else {
                lottie_switch.setMinAndMaxProgress(0.0f, 0.5f)
                lottie_switch.playAnimation()
                isSwitchOn = true
            }
        }
    }
}

package com.a.componentsmaterialdesing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a.componentsmaterialdesing.animations.AnimationsActivity
import com.a.componentsmaterialdesing.charts.ChartsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_bottom_plus_floating_button.setOnClickListener {
            val intent = Intent(this,ExampleBottomAppBarActivity::class.java)
            startActivity(intent)
        }

        bottom_sheet_dialog.setOnClickListener {
            val intent = Intent(this,BottomSheetDialogActivity::class.java)
            startActivity(intent)
        }

        btn_collapsing_toolbar.setOnClickListener {
            val intent = Intent(this,CollapsingToolbarActivity::class.java)
            startActivity(intent)
        }

        btn_animations.setOnClickListener {
            val intent = Intent(this,AnimationsActivity::class.java)
            startActivity(intent)
        }

        btn_chart.setOnClickListener {
            val intent = Intent(this,ChartsActivity::class.java)
            startActivity(intent)
        }

    }


}

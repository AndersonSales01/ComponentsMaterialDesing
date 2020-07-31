package com.a.componentsmaterialdesing.charts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a.componentsmaterialdesing.R
import com.a.componentsmaterialdesing.charts.bar.BarChartActivity
import com.a.componentsmaterialdesing.charts.pie.PieChartActivity
import com.a.componentsmaterialdesing.charts.radar.RadarChartActivity
import kotlinx.android.synthetic.main.activity_charts.*
/**
 * https://www.youtube.com/watch?v=vhKtbECeazQ
 */
class ChartsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charts)

        button_bar_chart.setOnClickListener {
            val intent = Intent(this,BarChartActivity::class.java)
            startActivity(intent)
        }

        button_pie_chart.setOnClickListener {
            val intent = Intent(this,PieChartActivity::class.java)
            startActivity(intent)
        }

        button_radar_chart.setOnClickListener {
            val intent = Intent(this,RadarChartActivity::class.java)
            startActivity(intent)
        }
    }
}

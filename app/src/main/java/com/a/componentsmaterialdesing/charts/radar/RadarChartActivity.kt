package com.a.componentsmaterialdesing.charts.radar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a.componentsmaterialdesing.R
import com.github.mikephil.charting.data.RadarData
import com.github.mikephil.charting.data.RadarDataSet
import com.github.mikephil.charting.data.RadarEntry
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import kotlinx.android.synthetic.main.activity_radar_chart.*

class RadarChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radar_chart)

        var visitorsForFirstWebSite = ArrayList<RadarEntry>()
        visitorsForFirstWebSite.add(RadarEntry(420f ))
        visitorsForFirstWebSite.add(RadarEntry(475f ))
        visitorsForFirstWebSite.add(RadarEntry(508f ))
        visitorsForFirstWebSite.add(RadarEntry(660f ))
        visitorsForFirstWebSite.add(RadarEntry(550f ))
        visitorsForFirstWebSite.add(RadarEntry(630f ))
        visitorsForFirstWebSite.add(RadarEntry(447f ))

        var radarDataSetForFirstWebSite = RadarDataSet(visitorsForFirstWebSite, "WebSite 1 ")
        radarDataSetForFirstWebSite.color = Color.RED
        radarDataSetForFirstWebSite.lineWidth = 2f
        radarDataSetForFirstWebSite.valueTextColor = Color.RED
        radarDataSetForFirstWebSite.valueTextSize = 14f

        var visitorsForSecondWebSite = ArrayList<RadarEntry>()
        visitorsForSecondWebSite.add(RadarEntry(310f))
        visitorsForSecondWebSite.add(RadarEntry(420f))
        visitorsForSecondWebSite.add(RadarEntry(685f))
        visitorsForSecondWebSite.add(RadarEntry(820f))
        visitorsForSecondWebSite.add(RadarEntry(490f))
        visitorsForSecondWebSite.add(RadarEntry(730f))
        visitorsForSecondWebSite.add(RadarEntry(200f))

        var radarDataSetForSecondWebSite = RadarDataSet(visitorsForSecondWebSite, "WebSite 2  ")
        radarDataSetForSecondWebSite.color = Color.BLUE
        radarDataSetForSecondWebSite.lineWidth = 2f
        radarDataSetForSecondWebSite.valueTextColor = Color.BLUE
        radarDataSetForSecondWebSite .valueTextSize = 14f

        var radarData = RadarData()
        radarData.addDataSet(radarDataSetForFirstWebSite)
        radarData.addDataSet(radarDataSetForSecondWebSite)

        var listLabel  = arrayOf("2014","2015","2016","2017","2018","2019","2020")

        var xAxis = chart_radar.xAxis
        xAxis.valueFormatter = IndexAxisValueFormatter(listLabel)

        chart_radar.data = radarData
        chart_radar.animateY(2000)

    }
}

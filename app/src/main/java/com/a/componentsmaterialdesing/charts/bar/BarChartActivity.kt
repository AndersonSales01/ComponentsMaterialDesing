package com.a.componentsmaterialdesing.charts.bar

import android.R.attr.entries
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.a.componentsmaterialdesing.R
import com.github.mikephil.charting.data.BarData
import com.github.mikephil.charting.data.BarDataSet
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_bar_chart.*


class BarChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bar_chart)

        var visitors = ArrayList<BarEntry>()

        visitors.add(BarEntry(2014f, 420f ))
        visitors.add(BarEntry(2015f, 475f ))
        visitors.add(BarEntry(2016f, 508f ))
        visitors.add(BarEntry(2017f, 660f ))
        visitors.add(BarEntry(2018f, 550f ))
        visitors.add(BarEntry(2019f, 630f ))
        visitors.add(BarEntry(2020f, 470f ))

        var barDataSet = BarDataSet(visitors,"Visitors ")
        // colocar cores diferentes para cara dado da lista visitors
        barDataSet.setColors(*ColorTemplate.MATERIAL_COLORS)
        barDataSet.valueTextColor = Color.BLACK
        barDataSet.valueTextSize = 16f

        var barData = BarData(barDataSet)

        bar_chart.setFitBars(true)
        bar_chart.data = barData
        bar_chart.description.text = "Bar Chart Example"
        //existe varias animation
        bar_chart.animateY(2000)


    }
}

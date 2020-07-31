package com.a.componentsmaterialdesing.charts.pie

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.a.componentsmaterialdesing.R
import com.github.mikephil.charting.data.BarEntry
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_pie_chart.*

class PieChartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)

        var visitors = ArrayList<PieEntry>()

        visitors.add(PieEntry(508f, "2016"))
        visitors.add(PieEntry(600f, "2017"))
        visitors.add(PieEntry(750f, "2018"))
        visitors.add(PieEntry(600f, "2019"))
        visitors.add(PieEntry(670f, "2020"))

        var pieDataSet = PieDataSet(visitors,"Visitors")
        pieDataSet.setColors(*ColorTemplate.COLORFUL_COLORS)
        pieDataSet.valueTextColor = Color.BLACK
        pieDataSet.valueTextSize = 16f

        var pieData= PieData(pieDataSet )
        pie_chart.data = pieData
        pie_chart.description.isEnabled = false
        pie_chart.centerText = "Visitors"
        pie_chart.animate()
        pie_chart.animateY(2000)
    }
}

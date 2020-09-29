package com.a.componentsmaterialdesing.search_view

import android.graphics.Color
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.a.componentsmaterialdesing.R
import kotlinx.android.synthetic.main.activity_search_view.*


class SearchViewActivity : AppCompatActivity() {

    private var mStrigsList: ArrayList<String> = ArrayList()
    private lateinit var searchViewAdapter: SearchViewAdapter
    private lateinit var manager: LinearLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_view)
        mockList()
        initViews()
    }


    private fun initViews() {

        setSupportActionBar(toolbar_search)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        searchViewAdapter = SearchViewAdapter(this, mStrigsList)

        manager = LinearLayoutManager(this)

        search_recyclerView.layoutManager = manager
        search_recyclerView.adapter = searchViewAdapter
    }


    private fun mockList() {
        mStrigsList.add("Anderson")
        mStrigsList.add("Halyson")
        mStrigsList.add("Pedro")
        mStrigsList.add("Jose")
        mStrigsList.add("Alyson")
        mStrigsList.add("Antonio")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_search_view, menu)


        val item: MenuItem? = menu?.findItem(R.id.action_search)

        if (item != null) {

            val searchView = item?.actionView as SearchView

            val searchEditText: EditText = searchView.findViewById<View>(R.id.search_src_text) as EditText

            searchEditText.setTextColor(resources.getColor(R.color.colorWhite))

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(p0: String?): Boolean {
                    return false
                }

                override fun onQueryTextChange(p0: String?): Boolean {

                    searchViewAdapter.filter.filter(p0)
                    return false
                }

            })

        }

        return super.onCreateOptionsMenu(menu)
    }

}
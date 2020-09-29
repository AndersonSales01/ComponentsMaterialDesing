package com.a.componentsmaterialdesing.search_view

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_search_view.view.*

class SearchViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindView(value: String) {
        itemView.text_searchView.text = value
    }
}




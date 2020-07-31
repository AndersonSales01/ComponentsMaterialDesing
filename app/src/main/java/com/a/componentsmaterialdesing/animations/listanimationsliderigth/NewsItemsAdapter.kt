package com.a.componentsmaterialdesing.animations.listanimationsliderigth

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.a.componentsmaterialdesing.R
import kotlinx.android.synthetic.main.news_item_container.view.*

class NewsItemsAdapter(val list: List<NewsItem>) : RecyclerView.Adapter<NewsItemsAdapter.NewsItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_item_container, parent, false)

        return NewsItemViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: NewsItemViewHolder, position: Int) {
        val item: NewsItem? = list[position]
        if (item != null) {
            holder.bind(item)
        }
    }

    inner class  NewsItemViewHolder(val mView: View): RecyclerView.ViewHolder(mView) {

        fun bind(newsItem: NewsItem){

            mView.text_title.text = newsItem.title
            mView.text_description.text = newsItem.description
        }

    }

}
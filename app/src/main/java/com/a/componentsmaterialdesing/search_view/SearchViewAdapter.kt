package com.a.componentsmaterialdesing.search_view

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import androidx.recyclerview.widget.RecyclerView
import com.a.componentsmaterialdesing.R

class SearchViewAdapter(val context: Context, private var mStringsList: ArrayList<String>) : RecyclerView.Adapter<SearchViewHolder>(),Filterable {

    private var listStringsAll: ArrayList<String> = ArrayList()

    init {
        listStringsAll.addAll(mStringsList)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_search_view, parent, false)
        return SearchViewHolder(view)
    }

    override fun getItemCount(): Int {
        return mStringsList.size
    }

    override fun onBindViewHolder(holder: SearchViewHolder, position: Int) {
        val stringValue = mStringsList[position]
        holder?.bindView(stringValue)
    }

    override fun getFilter(): Filter {
        return  myFilter
    }

    var myFilter: Filter = object : Filter() {
        //Automatic on background thread
        override fun performFiltering(charSequence: CharSequence): FilterResults {

            var filteredList: ArrayList<String> = ArrayList()

            if (charSequence.toString().isEmpty()) {
                filteredList.addAll(listStringsAll)
            } else {
                for (item in listStringsAll) {
                    if (item.toLowerCase().contains(charSequence.toString().toLowerCase())) {
                        filteredList.add(item)
                    }
                }
            }

            val filterResults = FilterResults()
            filterResults.values = filteredList

            return filterResults
        }

        //Automatic on UI thread
        override fun publishResults(
            charSequence: CharSequence,
            filterResults: FilterResults
        ) {
            mStringsList = ArrayList()
            mStringsList.addAll(filterResults.values as Collection<String>)
            notifyDataSetChanged()
        }
    }


}
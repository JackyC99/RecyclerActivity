package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val number : Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() /* TODO Step 3a: Provide Adapter Parent */ {

    class NumberViewHolder (val _textView: TextView) : RecyclerView.ViewHolder (_textView) {

        // TODO Step 3b: Complete function definitions for adapter
        val textView = _textView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(parent.context).apply{setPadding(10,10,10,10)}
        )
    }

    override fun getItemCount(): Int {
        return number.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder._textView.text = number[position].toString()
        holder._textView.textSize = number[position].toFloat()
    }
}
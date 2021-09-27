package edu.temple.cis_3515_assignment_3_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.temple.cis_3515_assignment_3_recyclerview.CustomAdapter.ViewHolder

class CustomAdapter(private val dataSet: List<ImageObject>) : RecyclerView.Adapter<ViewHolder>() {

    class ViewHolder(_itemView: View) : RecyclerView.ViewHolder(_itemView) {
        val imageView : ImageView = _itemView.findViewById(R.id.imageViewLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(dataSet[position].resourceId)
    }

    override fun getItemCount() = 3

}

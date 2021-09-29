package edu.temple.cis_3515_assignment_3_recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import edu.temple.cis_3515_assignment_3_recyclerview.ImageAdapter.ViewHolder


class ImageAdapter(private val dataSet: List<ImageObject>, private val onItemClicked: (position: Int) -> Unit) : RecyclerView.Adapter<ViewHolder>() {


    class ViewHolder(_itemView: View, private val onItemClicked: (position: Int) -> Unit) : RecyclerView.ViewHolder(_itemView), View.OnClickListener {
        val imageView : ImageView = _itemView.findViewById(R.id.imageViewLayout)

        init {
            _itemView.setOnClickListener(this)
        }
        override fun onClick(v: View?) {
            val position = adapterPosition
            onItemClicked(position)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_layout, parent, false)

        return ViewHolder(view, onItemClicked)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(dataSet[position].resourceId)
    }

    override fun getItemCount() = dataSet.size

}

package edu.temple.cis_3515_assignment_3_recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import edu.temple.cis_3515_assignment_3_recyclerview.ImageAdapter.ViewHolder

class ImageAdapter(private val dataSet: List<ImageObject>, activity: Activity) : RecyclerView.Adapter<ViewHolder>() {
    var imageView: ImageView = activity.findViewById(R.id.imageView)
    var textView: TextView = activity.findViewById(R.id.titleTextView)

    class ViewHolder(_itemView: View) : RecyclerView.ViewHolder(_itemView) {
        val imageView : ImageView = _itemView.findViewById(R.id.imageViewLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.image_layout, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imageView.setImageResource(dataSet[position].resourceId)

        holder.imageView.setOnClickListener{
            imageView.setImageResource(dataSet[position].resourceId)
            textView.text = dataSet[position].title
        }
    }

    override fun getItemCount() = 12

}

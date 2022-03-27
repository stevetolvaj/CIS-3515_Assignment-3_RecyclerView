package edu.temple.cis_3515_assignment_3_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {
    // Used in onItemClicked function outside of onCreate
    private lateinit var imageView: ImageView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView  = findViewById(R.id.imageView)
        textView = findViewById(R.id.titleTextView)
        val mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = ImageAdapter(imageList()) {
                position -> onItemClicked(position)
        }


        mRecyclerView.adapter = adapter
        mRecyclerView.layoutManager = GridLayoutManager(this, 3)


    }

    private fun onItemClicked(position: Int) {
        imageView.setImageResource(imageList()[position].resourceId)
        textView.text = imageList()[position].title
    }
}
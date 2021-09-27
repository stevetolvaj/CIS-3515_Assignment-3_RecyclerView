package edu.temple.cis_3515_assignment_3_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = CustomAdapter(imageList())
            mRecyclerView.adapter = adapter
        mRecyclerView.layoutManager = GridLayoutManager(this, 2)
//         val numOfColumns = 2;
//         mRecyclerView.layoutManager = GridLayoutManager(this, numOfColumns)

    }
}
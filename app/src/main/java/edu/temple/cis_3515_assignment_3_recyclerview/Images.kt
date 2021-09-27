package edu.temple.cis_3515_assignment_3_recyclerview

import android.content.res.Resources

fun imageList(): List<ImageObject> {
    return listOf(
        ImageObject(
            id = 1,
            title = "Meowing Cat",
            resourceId = R.drawable.meowing_cat
        ),
        ImageObject(
            id = 2,
            title = "Sleeping Cat",
            resourceId = R.drawable.sleeping_cat
        ),
        ImageObject(
            id = 3,
            title = "Playful Waving Cat",
            resourceId = R.drawable.playful_waving_cat
        )
    )
}
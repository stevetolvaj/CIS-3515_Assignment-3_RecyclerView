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
        ),
        ImageObject(
            id = 4,
            title = "Orange Cat on Sidewalk",
            resourceId = R.drawable.orange_sidewalk_cat
        ),
        ImageObject(
            id = 5,
            title = "Yawning Cat",
            resourceId = R.drawable.yawning_cat
        ),
        ImageObject(
            id = 6,
            title = "Green Eyed Cat",
            resourceId = R.drawable.green_eyed_cat
        ),
        ImageObject(
            id = 7,
            title = "White and Orange Cat",
            resourceId = R.drawable.white_and_orange_cat
        ),
        ImageObject(
            id = 8,
            title = "Two Kittens Sitting on Box",
            resourceId = R.drawable.two_kittens_sitting_on_box
        ),
        ImageObject(
            id = 9,
            title = "White Cat Laying on Bed",
            resourceId = R.drawable.white_cat_on_bed
        ),
        ImageObject(
            id = 10,
            title = "Kitten Scratching Post",
            resourceId = R.drawable.kitten_scratching_post
        ),
        ImageObject(
            id = 11,
            title = "Orange and White Cat Licking Lips",
            resourceId = R.drawable.white_orange_licking_cat
        ),
        ImageObject(
            id = 12,
            title = "Tuxedo Cat with Crown on Head",
            resourceId = R.drawable.tuxedo_cat_with_crown
        )
    )
}
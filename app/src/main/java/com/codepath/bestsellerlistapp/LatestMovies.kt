package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName
import android.os.Parcelable

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class LatestMovies {
    @SerializedName("original_title")
    var title: String? = null


    //TODO bookImageUrl
    @SerializedName("poster_path")
    var movieImageUrl:String? = null

    //TODO description
    @SerializedName("overview")
    var description:String? = null

    val url: String = "https://image.tmdb.org/t/p/w500/"

    //TODO-STRETCH-GOALS amazonUrl
}
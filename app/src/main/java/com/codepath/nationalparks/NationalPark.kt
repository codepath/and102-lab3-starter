package com.codepath.nationalparks

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single park from the National Parks API.
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
class NationalPark {

    // name field
    @JvmField
    @SerializedName("fullName")
    var name: String? = null

    // description field
    @JvmField
    @SerializedName("description")
    var description: String? = null

    // location or state field
    @JvmField
    @SerializedName("states")
    var location: String? = null

    //TODO parkImageUrl
    /*@JvmField
    @SerializedName("images[0].url")
    var imageUrl: String? = null
     */

    //TODO-STRETCH-GOALS
}

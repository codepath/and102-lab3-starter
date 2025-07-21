package com.codepath.nationalparks

/**
 * This interface is used by the [NationalParksRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [BestSellerBooksFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: NationalPark)
}

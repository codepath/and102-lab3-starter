package com.codepath.bestsellerlistapp

/**
 * This interface is used by the [LatestMoviesRecyclerViewAdapter] to ensure
 * it has an appropriate Listener.
 *
 * In this app, it's implemented by [BestSellerBooksFragment]
 */
interface OnListFragmentInteractionListener {
    fun onItemClick(item: LatestMovies)
}

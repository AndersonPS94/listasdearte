package com.devspacecomposeinit

class ListRepository {

    fun getArtistsList(): List<Artist> {
        return artistsList
    }

    private val artistsList = listOf(

        Artist(
            name = "Leonardo da Vinci",
            lastSeenOnline = "3 minutes ago",
            image = R.drawable.ic_leonardo_da_vinci,
            art = R.drawable.ic_mona_lisa),

        Artist(
            name = "Pablo Picasso",
            lastSeenOnline = "12 minutes ago",
            image = R.drawable.ic_pablo_picasso,
            art = R.drawable.ic_beijo),

        Artist(
            name = "Vincent van Gogh",
            lastSeenOnline = "25 minutes ago",
            image = R.drawable.ic_vincent_van_gogh,
            art = R.drawable.ic_starry_night),

        Artist(
            name = "Salvador Dali",
            lastSeenOnline = "45 minutes ago",
            image = R.drawable.ic_salvador_dali,
            art = R.drawable.ic_persistence_of_memory),
    )
}
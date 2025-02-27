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
            art = R.drawable.ic_mona_lisa,
            description = "Leonardo da Vinci (1452–1519) – An Italian Renaissance genius known for his mastery of painting, science, and engineering. His most renowned works, Mona Lisa and The Last Supper, showcase his revolutionary techniques in perspective, light, and anatomy."
        ),


        Artist(
            name = "Pablo Picasso",
            lastSeenOnline = "12 minutes ago",
            image = R.drawable.ic_pablo_picasso,
            art = R.drawable.ic_beijo,
            description ="Pablo Picasso (1881–1973) – A Spanish painter and sculptor who co-founded Cubism, radically transforming modern art. His masterpiece Guernica (1937) is a powerful anti-war statement, while his artistic evolution spanned multiple styles, from realism to abstraction."),

        Artist(
            name = "Vincent van Gogh",
            lastSeenOnline = "25 minutes ago",
            image = R.drawable.ic_vincent_van_gogh,
            art = R.drawable.ic_starry_night,
            description = "Vincent van Gogh (1853–1890) – A Dutch Post-Impressionist artist famous for his expressive brushstrokes and vibrant colors. Despite struggling with mental illness, he created masterpieces like Starry Night (1889) and Sunflowers (1888), which deeply influenced modern art."),

        Artist(
            name = "Salvador Dali",
            lastSeenOnline = "45 minutes ago",
            image = R.drawable.ic_salvador_dali,
            art = R.drawable.ic_persistence_of_memory,
            description = "Leonardo da Vinci (1452–1519) – An Italian Renaissance genius known for his mastery of painting, science, and engineering. His most renowned works, Mona Lisa and The Last Supper, showcase his revolutionary techniques in perspective, light, and anatomy."),
    )
}
package com.devspacecomposeinit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.devspacecomposeinit.designsystem.ToolbarWithBackButton
import com.devspacecomposeinit.ui.theme.ComposeInitTheme

@Composable
fun ArtistDetailScreen (
    artistId: Int,
    navController: NavController
){
    val repo = ListRepository()
    val artist = repo.getArtistById(artistId)

    Scaffold (
        topBar = {
            ToolbarWithBackButton(
                title = artist.name) {
                navController.popBackStack()
                }
            },
        content = { paddingValues ->
            ArtistDetailContent(artist,
                modifier = Modifier.padding(paddingValues)
            )
        }
    )
}

@Composable
private fun ArtistDetailContent(
    artist: Artist,
    modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        ArtistCard(
            artist = artist,
            onClick = {}
        )

        Text(
            modifier = Modifier.padding(16.dp),
            text = artist.description,
        )

    }
}

@Preview(showBackground = true)
@Composable
private fun ArtistDetailContentPreview() {
    ComposeInitTheme {
        val artist = Artist(
            id = 1,
            name = "Leonardo da Vinci",
            lastSeenOnline = "3 min ago",
            image = R.drawable.ic_leonardo_da_vinci,
            art = R.drawable.ic_mona_lisa,
            description = "Leonardo da Vinci (1452–1519) – An Italian Renaissance genius known for his mastery of painting, science, and engineering. His most renowned works, Mona Lisa and The Last Supper, showcase his revolutionary techniques in perspective, light, and anatomy.")

        ArtistDetailContent(artist)
    }
}
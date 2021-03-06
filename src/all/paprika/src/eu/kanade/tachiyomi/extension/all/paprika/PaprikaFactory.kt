package eu.kanade.tachiyomi.extension.all.paprika

import eu.kanade.tachiyomi.source.Source
import eu.kanade.tachiyomi.source.SourceFactory

class PaprikaFactory : SourceFactory {
    override fun createSources(): List<Source> = listOf(
        MangazukiXyz(),
        MangaTensei(),
        MangaNelo(),
        MangaWindowClub()
    )
}

class MangazukiXyz : Paprika("MangaZuki.xyz", "https://ir2me.com", "en")
class MangaTensei : Paprika("MangaTensei", "https://www.mangatensei.com", "en")
class MangaNelo : Paprika("MangaNelos.com", "http://manganelos.com", "en")
class MangaWindowClub : PaprikaAlt("MangaWindow.club", "https://mangawindow.club", "en")

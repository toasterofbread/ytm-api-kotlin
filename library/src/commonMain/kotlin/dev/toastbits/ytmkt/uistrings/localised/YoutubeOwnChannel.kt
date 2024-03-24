package dev.toastbits.ytmkt.uistrings.localised

import dev.toastbits.ytmkt.uistrings.YoutubeUILocalisation

fun getYoutubeOwnChannelLocalisations(languages: UILanguages): YoutubeUILocalisation.LocalisationSet =
    with(languages) {
        YoutubeUILocalisation.LocalisationSet().apply {
            add(
                en to "Songs on repeat",
                ja to "繰り返し再生されている曲" ,
                zh to "反复聆听的歌曲" ,
                es to "Canciones que más escuchastes",
                fr to "Titres en boucle",
                tr to "Tekrarlanan şarkılar"
            )
            add(
                en to "Artists on repeat",
                zh to "反复聆听的歌手" ,
                ja to "繰り返し再生するアーティスト" ,
                es to "Artistas más escuchados",
                fr to "Artistes en boucle",
                tr to "Tekrarlanan sanatçılar"
            )
            add(
                en to "Videos on repeat",
                zh to "反复收看的视频" ,
                ja to "繰り返し再生されている動画",
                fr to "Clips en boucle",
                tr to "Tekrarlanan videolar"
            )
            add(
                en to "Playlists on repeat",
                zh to "反复聆听的歌单" ,
                ja to "繰り返し再生するプレイリスト" ,
                es to "Playlist mas escuchadas",
                fr to "Liste de lecture en boucle",
                tr to "Tekrarlanan oynatma listeleri"
            )
            add(
                en to "Playlists",
                zh to "播放列表" ,
                ja to "再生リスト" ,
                es to "Playlists",
                fr to "Liste de lecture",
                tr to "Oynatma listeleri"
            )
        }
    }

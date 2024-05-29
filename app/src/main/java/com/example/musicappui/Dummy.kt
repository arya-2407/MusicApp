package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon : Int, val name : String)

val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_queue_music_24, "Playlist"),
    Lib(R.drawable.baseline_person_outline_24,"Artist"),
    Lib(R.drawable.baseline_album_24,"Album"),
    Lib(R.drawable.baseline_music_note_24,"Songs"),
    Lib(R.drawable.baseline_published_with_changes_24,"Genre")
)

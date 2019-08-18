package com.example.hermes.audio

import android.media.MediaPlayer

open class NonLoopingMonsterAudioPlayer(private val mediaPlayer: MediaPlayer) {
    var lastPlayed: Int = 0

    init {
        mediaPlayer.isLooping = false
        mediaPlayer.setVolume(1f, 1f)
    }

    open fun play(time: Int) {
        mediaPlayer.start()
        lastPlayed = time
    }
}
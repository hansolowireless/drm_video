package com.plugin.drm_video
//This class was added for drip feeding tests and functionality. If drip feeding is not needed in the future, remove this class.

import com.google.android.exoplayer2.DefaultLoadControl
import com.google.android.exoplayer2.LoadControl
import com.google.android.exoplayer2.Renderer
import com.google.android.exoplayer2.source.TrackGroupArray
import com.google.android.exoplayer2.trackselection.TrackSelectionArray
import com.google.android.exoplayer2.upstream.Allocator

class PlayerLoadControl: LoadControl {

    override fun onTracksSelected(renderers: Array<out Renderer>, trackGroups: TrackGroupArray, trackSelections: TrackSelectionArray) {
        TODO("Not yet implemented")
    }

    override fun getBackBufferDurationUs(): Long {
        TODO("Not yet implemented")
    }

    override fun retainBackBufferFromKeyframe(): Boolean {
        TODO("Not yet implemented")
    }

    override fun shouldContinueLoading(playbackPositionUs: Long, bufferedDurationUs: Long, playbackSpeed: Float): Boolean {
        TODO("Not yet implemented")
    }

    override fun onPrepared() {
        TODO("Not yet implemented")
    }

    override fun onReleased() {
        TODO("Not yet implemented")
    }

    override fun getAllocator(): Allocator {
        TODO("Not yet implemented")
    }

    override fun shouldStartPlayback(bufferedDurationUs: Long, playbackSpeed: Float, rebuffering: Boolean): Boolean {
        TODO("Not yet implemented")
    }

    override fun onStopped() {
        TODO("Not yet implemented")
    }

    private fun computeIsBuffering( bufferedDurationMs: Long) {
        var bufferTimeState: Int = getBufferTimeState(bufferedDurationMs)
//        var targetBufferSizeReached : Boolean = allocator.totalBytesAllocated >= targetBufferSize

        if (bufferTimeState == 1) {

        }
        else if (bufferTimeState == 2) {

        }
        else  if (bufferTimeState == 0) {

        }

    }

    private fun getBufferTimeState(bufferedDurationUs: Long): Int {
        return if (bufferedDurationUs > 50_000) 0 else if (bufferedDurationUs < 15_000) 1 else 2
    }

}
package com.dineshdk.spotifyclone.data.entities.remote

import com.dineshdk.spotifyclone.data.entities.Song
import com.dineshdk.spotifyclone.others.Constants.SONG_COLLECTION
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class MusicDatabase  {
    private val fireStore = FirebaseFirestore.getInstance()
    private val songCollection = fireStore.collection(SONG_COLLECTION)

    suspend fun getAllSong(): List<Song>{
        return try{
            songCollection.get().await().toObjects(Song::class.java)
        }catch (e: Exception){
            emptyList()
        }

    }




}
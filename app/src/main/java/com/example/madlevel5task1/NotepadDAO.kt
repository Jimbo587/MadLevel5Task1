package com.example.madlevel5task1

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NotepadDao {

    @Insert
    suspend fun insertNotepad(notepad: Notepad)

    @Query("SELECT * FROM notepadTable LIMIT 1")
    fun getAllNotepads(): LiveData<Notepad?>

    @Update
    suspend fun updateNotepad(notepad: Notepad)

}

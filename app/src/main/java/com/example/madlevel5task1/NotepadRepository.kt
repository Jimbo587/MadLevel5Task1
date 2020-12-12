package com.example.madlevel5task1

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class NotepadRepository(context: Context) {
    private var notepadDao: NotepadDao

    init {
        val notepadRoomDatabase = NotepadRoomDatabase.getDatabase(context)
        notepadDao = notepadRoomDatabase!!.notepadDao()
    }

    fun getNotepad(): LiveData<Notepad?> {
        return notepadDao.getAllNotepads()
    }

    suspend fun updateNotepad(note: Notepad) {
        notepadDao.updateNotepad(note)
    }
}
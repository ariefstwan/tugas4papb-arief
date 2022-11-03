package com.example.tugas4papbg.ui;

import android.app.Application;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tugas4papbg.database.Note;
import com.example.tugas4papbg.repository.NoteRepository;

import java.util.List;

public class NoteMainViewModel extends ViewModel {
    private final NoteRepository mNoteRepository;
    public NoteMainViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }
    LiveData<List<Note>> getAllNotes() {
        return mNoteRepository.getAllNotes();
    }
}
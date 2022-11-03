package com.example.tugas4papbg.ui;

import android.app.Application;

import androidx.lifecycle.ViewModel;

import com.example.tugas4papbg.database.Note;
import com.example.tugas4papbg.repository.NoteRepository;

public class NoteInsertUpdateViewModel extends ViewModel {
    private final NoteRepository mNoteRepository;

    public NoteInsertUpdateViewModel(Application application) {
        mNoteRepository = new NoteRepository(application);
    }

    public void insert(Note note) {
        mNoteRepository.insert(note);
    }

    public void update(Note note) {
        mNoteRepository.update(note);
    }

    public void delete(Note note) {
        mNoteRepository.delete(note);
    }

}

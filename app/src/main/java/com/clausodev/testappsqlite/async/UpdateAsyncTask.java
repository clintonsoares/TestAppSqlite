package com.clausodev.testappsqlite.async;

import android.os.AsyncTask;
import android.util.Log;

import com.clausodev.testappsqlite.models.Note;
import com.clausodev.testappsqlite.persistence.NoteDao;

public class UpdateAsyncTask extends AsyncTask<Note, Void, Void> {

    private static final String TAG = "InsertAsyncTaskLogger";
    private NoteDao mNoteDao;

    public UpdateAsyncTask(NoteDao dao) {
        mNoteDao = dao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        Log.d(TAG, "doInBackground: thread-"+ Thread.currentThread().getName());
        mNoteDao.updateNotes(notes);
        return null;
    }
}

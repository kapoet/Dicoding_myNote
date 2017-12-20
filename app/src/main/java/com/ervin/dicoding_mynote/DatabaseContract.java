package com.ervin.dicoding_mynote;

import android.provider.BaseColumns;

/**
 * Created by ervin on 12/20/2017.
 */

public class DatabaseContract {

    static String TABLE_NOTE = "note";
    static final class NoteColumns implements BaseColumns {
        //Note title
        static String TITLE = "title";
        //Note description
        static String DESCRIPTION = "description";
        //Note date
        static String DATE = "date";
    }
}
package com.reindra.mynotesapp.db

import android.provider.BaseColumns

internal class DatabaseContract {

    internal class NoteColumns : BaseColumns {
    const val AUTHORITY = "com.reindra.mynotesapp"
    const val SCHEME = "content"
        companion object {
            const val TABLE_NAME = "note"
            const val _ID = "_id"
            const val TITLE = "title"
            const val DESCRIPTION = "description"
            const val DATE = "date"
        }

    }
}
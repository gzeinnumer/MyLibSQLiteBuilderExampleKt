package com.gzeinnumer.mylibsqlitebuilderexamplekt

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.os.Environment
import com.gzeinnumer.mylibsqlitebuilderexamplekt.table.Table1
import com.gzeinnumer.mylibsqlitebuilderexamplekt.table.Table2
import com.gzeinnumer.mylibsqlitebuilderexamplekt.table.Table3
import com.gzeinnumer.sb.SQLiteBuilder
import com.gzeinnumer.sb.struct.SQLiteDatabaseEntity

@SQLiteDatabaseEntity(entities = [Table1::class, Table2::class, Table3::class])
class DBInstance : SQLiteBuilder() {

    companion object {
        private const val TAG = "DBInstance_"
        private lateinit var sqLiteDatabase: SQLiteDatabase
        var DB_PATH_EXTERNAL = Environment.getExternalStorageDirectory().toString() + "/MyLibSQLiteExternal/MyLibSQLiteSimple.db"
        var DB_PATH_BC = Environment.getExternalStorageDirectory().toString() + "/MyLibSQLiteBC/MyLibSQLiteSimple.db"
        var DB_NAME = "MyLibSQLiteSimple.db"

        fun getDataBase(context: Context?): SQLiteDatabase {
            sqLiteDatabase =
                builder(DBInstance::class.java, context)
                    .setDatabaseName(DB_NAME)
                    .setDatabaseVersion(1)
//                    .putDatabaseToExternal(DB_PATH_BC)
//                    .loadDatabaseFromExternal(DB_PATH_EXTERNAL)
                    .build()
            return sqLiteDatabase
        }
    }

    fun delete(): Boolean {
        return deleteDatabase(DB_PATH_EXTERNAL)
    }

    fun deleteRootDb(context: Context?): Boolean {
        return deleteDatabaseOnRoot(context, DB_NAME)
    }

    fun backUp(context: Context?): Boolean {
        val BACK_UP_TO = Environment.getExternalStorageDirectory()
            .toString() + "/MyLibSQLiteExternalBackUp"
        return backUpDatabase(context, BACK_UP_TO, DB_NAME)
    }

    val isDBExist: Boolean
        get() = isDatabaseExists(DB_PATH_EXTERNAL)

    fun isDBExistOnRoot(context: Context?): Boolean {
        return isDatabaseExistOnRoot(context, DB_NAME)
    }
}

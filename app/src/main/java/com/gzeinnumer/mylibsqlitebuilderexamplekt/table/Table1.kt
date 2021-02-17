package com.gzeinnumer.mylibsqlitebuilderexamplekt.table

import com.gzeinnumer.sb.struct.CreateTableQuery

@CreateTableQuery(query = "CREATE TABLE table1 (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, rating REAL, descr TEXT, flag_active INTEGER, created_at TEXT)")
class Table1 {
    private val id = 0
    private val name: String? = null
    private val rating = 0.0
    private val desc: String? = null
    private val flag_active = 0
    private val created_at: String? = null
    private val KEY_ID = ""
    private val KEY_NAME = "name"
    private val KEY_RATING = "rating"
    private val KEY_DESC = "desc"
    private val KEY_FLAG_ACTIVE = "flag_active"
    private val KEY_CRATED_AT = "created_at"
}
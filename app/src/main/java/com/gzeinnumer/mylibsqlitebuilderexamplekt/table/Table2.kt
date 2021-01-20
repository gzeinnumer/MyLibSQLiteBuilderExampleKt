package com.gzeinnumer.mylibsqlitebuilderexamplekt.table

import com.gzeinnumer.mylibsqlitebuilder.struct.CreateTableQuery

@CreateTableQuery(query = "CREATE TABLE table2 (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, id_table1 INTEGER)")
class Table2 {
    private val id = 0
    private val name: String? = null
    private val id_table1 = 0
    private val KEY_ID = "id"
    private val KEY_NAME = "name"
    private val KEY_ID_TABLE1 = "id_table1" //constructor
    //getter setter
}
package com.gzeinnumer.mylibsqlitebuilderexamplekt.activity

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.gzeinnumer.mylibsqlitebuilderexamplekt.DBInstance
import com.gzeinnumer.mylibsqlitebuilderexamplekt.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {


    private val TAG = "TestActivity"

    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val database: SQLiteDatabase = DBInstance.getDataBase(applicationContext)
        val dbInstance = DBInstance()

        binding.btnDeleteDb.setOnClickListener {
            val dbDeleted: Boolean = dbInstance.delete()
            Log.d(TAG, "onCreate_11: $dbDeleted")
        }
        binding.btnBackUpDb.setOnClickListener {
            val dbBackup: Boolean = dbInstance.backUp(applicationContext)
            Log.d(TAG, "onCreate_12: $dbBackup")
        }
        binding.btnDbRoot.setOnClickListener {
            val isExists: Boolean = dbInstance.isDBExistOnRoot(applicationContext)
            Log.d(TAG, "onCreate_13: $isExists")
        }
        binding.btnDbExternal.setOnClickListener {
            val isExists: Boolean = dbInstance.isDBExist
            Log.d(TAG, "onCreate_14: $isExists")
        }
    }
}
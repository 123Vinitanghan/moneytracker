package com.example.moneytracker.ui

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.widget.Toast

class Databasemoney(context: Context?) : SQLiteOpenHelper(context,"Money.db", null, 1) {


    var context = context

    override fun onCreate(db: SQLiteDatabase?) {
        var que = "CREATE TABLE Moneytracker(id INTEGER PRIMARY KEY AUTOINCREMENT,Date INTEGER, Categories TEXT,Amount INTEGER,ExtrNote TEXT )"
        db?.execSQL(que)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    fun InsertData(Date: String, Categories: String, Amount:Int, ExtrNote:String){

        var db=writableDatabase
        var values =ContentValues()
        values.put("Date",Date)
        values.put("Categories",Categories)
        values.put("Amount",Amount)
        values.put("ExtrNote",ExtrNote)

        var iss = db.insert("Moneytracker",null,values)
        if (iss.toInt() == -1) {
            Toast.makeText(context,"Data Insert Failed",Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context,"Data Insert Success",Toast.LENGTH_SHORT).show()
        }
    }

   fun RetriveData ():ArrayList<UserData>{

       var Datalist = ArrayList<UserData>()
       var db = readableDatabase
       var que ="SELECT * FROM Moneytracker"

       var cursor: Cursor = db.rawQuery(que,null)
       cursor.moveToFirst()

       for(i in 0..cursor.count-1) {

           var id = cursor.getInt(0)
           var Date = cursor.getInt(1)
           var Categories = cursor.getString(2)
           var Amount = cursor.getInt(3)
           var ExtrNote = cursor.getString(4)

           var userData = UserData(id, Date, Categories, Amount,ExtrNote)
           Datalist.add(userData)
           cursor.moveToNext()
       }
       return Datalist
   }


}
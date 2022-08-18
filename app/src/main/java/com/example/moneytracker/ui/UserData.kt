package com.example.moneytracker.ui

import java.util.*

class UserData {

    var id = 0
    var Date = 0
    lateinit var Categories :String
    var Amount =0
    lateinit var ExtrtaNote:String

        constructor(id: Int, Date: Int, Categories: String, Amount: Int, ExtrtaNote: String) {
        this.id = id
        this.Date = Date
        this.Categories = Categories
        this.Amount = Amount
        this.ExtrtaNote = ExtrtaNote
    }
}

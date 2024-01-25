package com.example.ejerciciostema3pm

data class Item(
    var nombre:String,
    var imagen:Int?=R.drawable.pito3,
    var check:Boolean=false,
    var isChecked:Boolean=false
) {
}
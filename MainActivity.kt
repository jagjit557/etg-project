package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var firstname:EditText
    lateinit var lastname:EditText
    lateinit var age:EditText
    lateinit var address:EditText
    lateinit var message1:TextView
    lateinit var message2:TextView
    lateinit var message3:TextView
    lateinit var message4:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstname = findViewById(R.id.firstname)
        lastname = findViewById(R.id.lastname)
        age = findViewById(R.id.age)
        address = findViewById(R.id.address)

        message1 = findViewById(R.id.message1)
        message2 = findViewById(R.id.message2)
        message3 = findViewById(R.id.message3)
        message4 = findViewById(R.id.message4)

    }

    fun submit(view: View){

        var f1:String = firstname.text.toString()
        message1.text =  f1

        var f2:String = lastname.text.toString()
        message2.text = f2

        var f3:String = age.text.toString()
        message3.text = f3
        var f4:String = address.text.toString()
        message4.text = f4

    }

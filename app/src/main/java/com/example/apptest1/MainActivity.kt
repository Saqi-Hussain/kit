package com.example.apptest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    private lateinit var addbtn:Button
    private lateinit var subbtn:Button
    private lateinit var dividebtn:Button
    private lateinit var multiplybtn:Button
    private lateinit var ent1:EditText
    private lateinit var  ent2:EditText
    private lateinit var res:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectXML()
        calculate()
    }



    private fun connectXML()
    {

        ent1= findViewById(R.id.First_input)
        ent2=findViewById(R.id.Second_input)
        res=findViewById(R.id.result_id)
        addbtn=findViewById(R.id.add_btn)
        subbtn=findViewById(R.id.sub_btn)
        dividebtn=findViewById(R.id.divide_btn)
        multiplybtn=findViewById(R.id.multiply_btn)
    }
    private fun calculate(){
        addbtn.setOnClickListener {
            sumNumbers()
        }
        subbtn.setOnClickListener{
            subBNumber()
        }
        dividebtn.setOnClickListener {
            divideNumber()
        }
        multiplybtn.setOnClickListener {
            multiplyNumber()
        }
    }

    private fun multiplyNumber() {

        try {
            var result = ent1.text.toString().toDouble()*ent2.text.toString().toDouble()
            res.text=result.toString()
        }
        catch (ex:Exception){
            Toast.makeText(this,ex.message,Toast.LENGTH_LONG).show()
        }
    }

    private fun divideNumber() {

        try {
            var result = ent1.text.toString().toDouble()/ent2.text.toString().toDouble()
            res.text=result.toString()
        }
        catch (ex:Exception){
            Toast.makeText(this,ex.message,Toast.LENGTH_LONG).show()
        }
    }

    private fun subBNumber() {

        try {
            var result = ent1.text.toString().toDouble()-ent2.text.toString().toDouble()
            res.text=result.toString()
        }
        catch (ex:Exception){
            Toast.makeText(this,ex.message,Toast.LENGTH_LONG).show()
        }
    }

    private fun sumNumbers() {

        try {
            var result = ent1.text.toString().toDouble()+ent2.text.toString().toDouble()
            res.text=result.toString()
        }
        catch (ex:Exception){
            Toast.makeText(this,ex.message,Toast.LENGTH_LONG).show()
        }
    }
}

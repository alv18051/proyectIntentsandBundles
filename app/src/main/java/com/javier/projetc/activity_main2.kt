package com.javier.projetc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.*
import androidx.annotation.IntegerRes
import androidx.core.text.toHtml
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class activity_main2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle = intent.extras



        /*val texto1 = findViewById<EditText>(R.id.text1)
        val texto2 = findViewById<EditText>(R.id.text2)
        var dato1 = texto1.text.toString().toInt()
        var dato2 = texto2.text.toString().toInt()*/





        if (bundle != null ){

            if(intent.hasExtra("valor")){


                button2.setOnClickListener(){
                    var num1 = Integer.parseInt(text1.text.toString())
                    var num2 = Integer.parseInt(text2.text.toString())
                    var res : Int

                    var sum : Int = num1 + num2

                    res = sum
                    res.toString()
                    var intent: Intent = Intent()
                    intent.putExtra("resultado1", "el resultado es $res")
                    setResult(RESULT_OK, intent)
                    finish()
                }
            }else if (intent.hasExtra("valor3")){
                button2.setOnClickListener(){
                    var num1 = Integer.parseInt(text1.text.toString())
                    var num2 = Integer.parseInt(text2.text.toString())
                    var res : Int

                    var sum : Int = num1 - num2

                    res = sum
                    res.toString()
                    var intent: Intent = Intent()
                    intent.putExtra("resultado1", "el resultado es $res")
                    setResult(RESULT_OK, intent)
                    finish()
                }

            } else if (intent.hasExtra("valor4")){
                button2.setOnClickListener(){
                    var num1 = Integer.parseInt(text1.text.toString())
                    var num2 = Integer.parseInt(text2.text.toString())
                    var res : Int

                    var sum : Int = num1 * num2

                    res = sum
                    res.toString()
                    var intent: Intent = Intent()
                    intent.putExtra("resultado1", "el resultado es $res")
                    setResult(RESULT_OK, intent)
                    finish()
                }

            }else if (intent.hasExtra("valor5")){
                button2.setOnClickListener(){
                    var num1 = Integer.parseInt(text1.text.toString())
                    var num2 = Integer.parseInt(text2.text.toString())
                    var res : Int

                    var sum : Int = num1 / num2

                    res = sum
                    res.toString()
                    var intent: Intent = Intent()
                    intent.putExtra("resultado1", "el resultado es $res")
                    setResult(RESULT_OK, intent)
                    finish()
                }

            }




        }



    }


}








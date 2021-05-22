package com.javier.projetc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener{
            val intent: Intent = Intent( this, activity_main2 :: class.java )
            intent.putExtra("valor", "suma")
            //intent.putExtra("valor2", "suma")
            //intent.putExtra("valor3","suma")
            //startActivity(intent)
            //finish()

            startActivityForResult(intent, 1)
            
        }

        button3.setOnClickListener{
            val intent: Intent = Intent( this, activity_main2 :: class.java )
            intent.putExtra("valor3", "resta")
            //intent.putExtra("valor2", "suma")
            //intent.putExtra("valor3","suma")
            //startActivity(intent)
            //finish()

            startActivityForResult(intent, 1)

        }
        button4.setOnClickListener{
            val intent: Intent = Intent( this, activity_main2 :: class.java )
            intent.putExtra("valor4", "multiplicacion")
            //intent.putExtra("valor2", "suma")
            //intent.putExtra("valor3","suma")
            //startActivity(intent)
            //finish()

            startActivityForResult(intent, 1)

        }
        button5.setOnClickListener{
            val intent: Intent = Intent( this, activity_main2 :: class.java )
            intent.putExtra("valor5", "division")
            //intent.putExtra("valor2", "suma")
            //intent.putExtra("valor3","suma")
            //startActivity(intent)
            //finish()

            startActivityForResult(intent, 1)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == RESULT_OK){
            if (requestCode == 1){
                val bundle = data?.extras
                if (bundle != null){
                    val resultado = bundle.getString("resultado1")
                    Toast.makeText(this,resultado, Toast.LENGTH_SHORT).show()

                }

            }

        }
    }
}
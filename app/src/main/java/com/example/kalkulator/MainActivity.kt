package com.example.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun butNumberEvent(view: View){

        val butSelected = view as Button
        var butClickValue:String = numberText.text.toString()

        val tv = findViewById(R.id.numberText) as TextView
        val num = tv.text.toString()

        if ( num == "0"){
            butClickValue = ""
        }

        when(butSelected.id){
            but0.id->{ butClickValue += "0" }
            but1.id->{ butClickValue += "1" }
            but2.id->{ butClickValue += "2" }
            but3.id->{ butClickValue += "3" }
            but4.id->{ butClickValue += "4" }
            but5.id->{ butClickValue += "5" }
            but6.id->{ butClickValue += "6" }
            but7.id->{ butClickValue += "7" }
            but8.id->{ butClickValue += "8" }
            but9.id->{ butClickValue += "9" }
            butDot.id->{

                if(num.contains(".")){
                    butClickValue += ""
                    Log.d("Test", "L - 1")
                }
                else if(numberText.text.equals("0")){
                    butClickValue += "0."
                    Log.d("Test", "L - 2")
                }
                else {
                    butClickValue += "."
                    Log.d("Test", "L - 3")
                }
            }
            butAc.id ->  {
                butClickValue = ""
                Log.d("button Cleared", "AC")
            }
            butPlusMinus.id ->  {
                if( num == "") {
                    butClickValue += "0"
                }
                else if( num == "0"){
                    butClickValue = "0"
                }

                else if(num.first().toString() == "-") {
                    //num.contains("-")){
                    Log.d(num.first().toString(), "L_log - 1")
                    //butClickValue.replace("-","456")
                    num.removeRange(0,1)

                }
                else{
                    butClickValue = "-" + butClickValue
                    Log.d(num.first().toString(), "L_log - 2")
                }

            }
            butPlus.id      ->  { butClickValue += "+" }
            butMInus.id     ->  { butClickValue = "-" }

            butEqual.id     -> {
                val summary = 0

            }
        }
        numberText.setText(butClickValue)
    }
}

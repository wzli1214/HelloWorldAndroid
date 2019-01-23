package com.example.mytestapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //var are like final in JAV can't reassign
        val sting = "hello world"

       //var can be assigned
        var string2: String?  = "creating variables"
        var string2 = "new stuff"
        string2 = null


        private fun getStringLength(string: String?): Int{
//            call length if string is non-null, other return 0
            return string?.length ?: 0
        }
//        val length = string2.length




    }
}

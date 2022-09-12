package com.example.kotlindemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.kotlindemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    private var name = MyName("Seif Ashraf")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
       /*
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)


        binding.button.setOnClickListener { v -> addName(v) }
        */

        val iPhone11Pro : Mobile = iPhone11Pro(properties = "iPhone", model = "11 Pro",MRP= 14000.00,discount = 30.00)

        println(iPhone11Pro.getActualPrice())

        val samsungGalaxyS20  : Mobile = SamsungGalaxyS20(properties = "Samsung", model = "GalaxyS20",MRP= 14000.00,discount = 30.00)

        println(samsungGalaxyS20.getActualPrice())

        val onePlus7 : Mobile = OnePlus7(properties = "OnePlus", model = "7",MRP= 14000.00,discount = 30.00)

        println(onePlus7.getActualPrice())

    }

    open class Mobile(var properties : String,
                      var model : String,
                      var MRP : Double,
                      var discount : Double
            ){
        open fun getActualPrice(): Double {
            return MRP - MRP * discount
        }
        open fun printDetails() : String {
            return "$model $properties"
        }
    }

    class iPhone11Pro(properties: String, model: String,MRP: Double, discount : Double) :
        Mobile(properties, model,MRP, discount){
        override fun getActualPrice(): Double {
            return super.getActualPrice()
        }

        override fun printDetails(): String {
            return super.printDetails()
        }
    }

    class SamsungGalaxyS20(properties: String, model: String,MRP: Double, discount : Double) :
        Mobile(properties, model,MRP, discount){
        override fun getActualPrice(): Double {
            return super.getActualPrice()
        }

        override fun printDetails(): String {
            return super.printDetails()
        }
    }

    class OnePlus7(properties: String, model: String,MRP: Double, discount : Double) :
        Mobile(properties, model,MRP, discount){
        override fun getActualPrice(): Double {
            return super.getActualPrice()
        }

        override fun printDetails(): String {
            return super.printDetails()
        }
    }

/*
    private fun addName(view: View?) {
        binding.apply {
            binding.myName = name
            invalidateAll()
            //val editText = binding.editText
            //binding.textView.text = editText.text

        val imm : InputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view?.windowToken, 0)
        }
    }
*/
}
package com.talo.dynamictiming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.talo.dynamictiming.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private var number = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        add()
        sub()
        subOneHundred()
        subFiveHundred()
        subOneThousand()
    }

    private fun add() {
        binding.addBtn.setOnClickListener {
            GlobalScope.launch(Dispatchers.Main) {
                for (i in number..4000) {
                    binding.reciprocalNumber.text = "$i"
                    delay(1)
                    number = i
                }

            }
        }
    }

    private fun sub() {
        binding.subBtn.setOnClickListener {

            if (number == 0) number = 0 else number--
            GlobalScope.launch(Dispatchers.Main) {
                for (i in number downTo 0) {
                    binding.reciprocalNumber.text = "$i"
                    delay(1)
                    number = i
                }

            }

        }
    }
    private fun subOneHundred(){
        binding.btnOneHundred.setOnClickListener {
            var nowNumber = number - 100
            if (number == 0) {
                number = 0
            } else{
                GlobalScope.launch(Dispatchers.Main) {
                    for (i in number downTo nowNumber) {
                        binding.reciprocalNumber.text = "$i"
                        delay(1)
                        number = i
                    }
                }
            }
        }
    }
    private fun subFiveHundred(){
        binding.btnFiveHundred.setOnClickListener {
            var nowNumber = number - 500
            if (number == 0) {
                number = 0
            } else{
                GlobalScope.launch(Dispatchers.Main) {
                    for (i in number downTo nowNumber) {
                        binding.reciprocalNumber.text = "$i"
                        delay(1)
                        number = i
                    }
                }
            }
        }
    }
    private fun subOneThousand(){
        binding.btnOneThousand.setOnClickListener {
            var nowNumber = number - 1000
            if (number == 0) {
                number = 0
            } else{
                GlobalScope.launch(Dispatchers.Main) {
                    for (i in number downTo nowNumber) {
                        binding.reciprocalNumber.text = "$i"
                        delay(1)
                        number = i
                    }
                }
            }
        }
    }
}
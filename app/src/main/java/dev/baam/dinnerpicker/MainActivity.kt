package dev.baam.dinnerpicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


    // inheriting certain attributes from this class
class MainActivity : AppCompatActivity() {
    // viewDidLoad()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        selectedFoodText.text = "Burger King"
    }


        


}
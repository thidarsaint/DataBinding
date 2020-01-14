package com.tds.databindingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.tds.databindingexample.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        var btnSubmit = binding.btnSubmit

        btnSubmit.setOnClickListener {
            var editName :String = binding.editTxtName.text.toString()
            var editOccupation : String = binding.editTxtOccupation.text.toString()

            var person : Person = Person(editName, editOccupation)

            binding.person = person

        }

    }
}

package uz.itschool.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.second_layout.*

class Second_Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)
        easy_button.setOnClickListener {

        }
    }


    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}
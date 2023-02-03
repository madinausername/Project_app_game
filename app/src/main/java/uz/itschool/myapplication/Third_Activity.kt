package uz.itschool.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.second_layout.*
import kotlinx.android.synthetic.main.third_layout.*

class Third_Activity: AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.third_layout)
        if((!edit_text_name.text.toString().isEmpty() && !edit_text_name_1.text.toString().isEmpty()) && (!edit_text_name.text.toString().isDigitsOnly() && !edit_text_name_1.text.toString().isDigitsOnly())){
            var intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        else{

        }
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }

}

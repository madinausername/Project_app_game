package uz.itschool.myapplication

import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.first_layout.*
import kotlinx.coroutines.delay

class First_Activity : AppCompatActivity(), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)

            ObjectAnimator.ofFloat(letter_1,"translationX",-700f)
                .apply {
                    letter_1.visibility=View.VISIBLE
                    duration = 500
                    start()
                }

            ObjectAnimator.ofFloat(letter_2,"translationX",-600f)
                .apply {
                    letter_2.visibility=View.VISIBLE
                    duration = 700
                    start()
                }
            ObjectAnimator.ofFloat(letter_3,"translationX",-500f)
                .apply {
                    letter_3.visibility=View.VISIBLE
                    duration = 900
                    start()
                }
            ObjectAnimator.ofFloat(letter_4,"translationX",-400f)
                .apply {
                    letter_4.visibility=View.VISIBLE

                    duration = 1100
                    start()
                }
            ObjectAnimator.ofFloat(letter_5,"translationX",-300f)
                .apply {
                    letter_5.visibility=View.VISIBLE

                    duration = 1300
                    start()
                }
            ObjectAnimator.ofFloat(letter_6,"translationX",-200f)
                .apply {
                    letter_6.visibility=View.VISIBLE

                    duration = 1500
                    start()
                }



            /*Handler().postDelayed({
                button2.visibility=View.GONE
            }, 300)*/
        }




    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}
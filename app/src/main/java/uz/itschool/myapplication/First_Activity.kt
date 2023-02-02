package uz.itschool.myapplication

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class First_Activity : AppCompatActivity(), View.OnClickListener {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_layout)

        var animation:Animation=AnimationUtils.loadAnimation(this,R.anim.set)
        var btn=findViewById<Button>(R.id.button2)

        animation.setAnimationListener(object : Animation.AnimationListener{
            override fun onAnimationStart(p0: Animation?) {
                TODO("Not yet implemented")
            }

            override fun onAnimationEnd(p0: Animation?) {
                btn.startAnimation(animation)
            }
            override fun onAnimationRepeat(p0: Animation?) {

            }

        })
    }

    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}
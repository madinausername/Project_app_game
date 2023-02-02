package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var matrix = Array(3){IntArray(3) {-1} }
    var active=true

    var p=""
    var p_2=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        image_1.setOnClickListener(this)
        image_2.setOnClickListener(this)
        image_3.setOnClickListener(this)
        image_4.setOnClickListener(this)
        image_5.setOnClickListener(this)
        image_6.setOnClickListener(this)
        image_7.setOnClickListener(this)
        image_8.setOnClickListener(this)
        image_9.setOnClickListener(this)
        restart.setOnClickListener {
            restart()
            turn_1.visibility = View.VISIBLE
            turn_2.visibility = View.VISIBLE
        }



    }

    override fun onClick(p0: View?) {
        val img = findViewById<ImageView>(p0!!.id)
        var t = img.tag.toString().toInt()
        var col: Int = t / 3
        var row: Int = t % 3
        if (matrix[col][row] == -1) {
            if (active) {
                img.setImageResource(R.drawable.x)
                active = false
                matrix[col][row] = 1
                turn_turn_1.visibility = View.VISIBLE
                turn_turn_2.visibility = View.VISIBLE
                turn_1.visibility = View.INVISIBLE
                turn_2.visibility = View.INVISIBLE
                isWinner(1)

            } else {
                img.setImageResource(R.drawable.o)
                active = true
                matrix[col][row] = 0
                turn_1.visibility = View.VISIBLE
                turn_2.visibility = View.VISIBLE
                turn_turn_1.visibility = View.INVISIBLE
                turn_turn_2.visibility = View.INVISIBLE
                isWinner(0)
            }
        }

    }
    fun isWinner(a: Int) {
        var count = 0
        for (i in 0..2) {
            for (j in 0..2) {
                if (matrix[i][j] == a) {
                    count++
                }
            }
            if (count == 3) {
                winner.text = "Winner is " + a
                if(a==1){
                     p = score_user_1_num.text.toString()
                    p= (p.toInt()+1).toString()
                    score_user_1_num.text=p
                }
                else if(a==0){
                   p_2 = score_user_2_num.text.toString()
                    p_2= (p_2.toInt()+1).toString()
                    score_user_2_num.text=p_2
                }
                finishGame()
                return
            }
            count = 0
        }
        count = 0
        for (i in 0..2) {
            for (j in 0..2) {
                if (matrix[j][i] == a) {
                    count++
                }
            }
            if (count == 3) {
                winner.text = "Winner is " + a
                if(a==1){
                    p = score_user_1_num.text.toString()
                    p= (p.toInt()+1).toString()
                    score_user_1_num.text=p
                }
                else if(a==0){
                    p_2 = score_user_2_num.text.toString()
                    p_2= (p_2.toInt()+1).toString()
                    score_user_2_num.text=p_2
                }
                finishGame()
                return
            }
            count = 0
        }
        count = 0
        for (i in 0..2) {
            for (j in 0..2) {
                if (i == j) {
                    if (matrix[j][i] == a) {
                        count++
                    }
                }
            }
        }
        if (count == 3) {
            winner.text = "Winner is " + a
            if(a==1){
                p = score_user_1_num.text.toString()
                p= (p.toInt()+1).toString()
                score_user_1_num.text=p
            }
            else if(a==0){
                p_2 = score_user_2_num.text.toString()
                p_2= (p_2.toInt()+1).toString()
                score_user_2_num.text=p_2
            }
            finishGame()
            return
        }
        count = 0
        for (i in 0..2) {
            for (j in 0..2) {
                if (i + j == 2) {
                    if (matrix[j][i] == a) {
                        count++
                    }
                }
            }
        }
        if (count == 3) {
            winner.text = "Winner is " + a
            if(a==1){
                p = score_user_1_num.text.toString()
                p= (p.toInt()+1).toString()
                score_user_1_num.text=p
            }
            else if(a==0){
                p_2 = score_user_2_num.text.toString()
                p_2= (p_2.toInt()+1).toString()
                score_user_2_num.text=p_2
            }
            finishGame()
            return
        }
    }

    fun finishGame() {
        image_1.isEnabled = false
        image_2.isEnabled = false
        image_3.isEnabled = false
        image_4.isEnabled = false
        image_5.isEnabled = false
        image_6.isEnabled = false
        image_7.isEnabled = false
        image_8.isEnabled = false
        image_9.isEnabled = false
        restart.visibility = View.VISIBLE
    }

    fun restart() {
        matrix = Array(3) { IntArray(3) { -1 } }
        active = true
        //active_player.text = "Player X"
        turn_1.visibility = View.INVISIBLE
        turn_2.visibility = View.INVISIBLE
        turn_turn_1.visibility = View.INVISIBLE
        turn_turn_2.visibility = View.INVISIBLE

        restart.visibility = View.INVISIBLE


        winner.text = ""

        image_1.isEnabled = true
        image_2.isEnabled = true
        image_3.isEnabled = true
        image_4.isEnabled = true
        image_5.isEnabled = true
        image_6.isEnabled = true
        image_7.isEnabled = true
        image_8.isEnabled = true
        image_9.isEnabled = true

        image_1.setImageDrawable(null)
        image_2.setImageDrawable(null)
        image_3.setImageDrawable(null)
        image_4.setImageDrawable(null)
        image_5.setImageDrawable(null)
        image_6.setImageDrawable(null)
        image_7.setImageDrawable(null)
        image_8.setImageDrawable(null)
        image_9.setImageDrawable(null)

    }



}
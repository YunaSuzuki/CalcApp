package jp.techacademy.yuna.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import kotlinx.android.synthetic.main.activity_result.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            button1.setOnClickListener(this)
            button2.setOnClickListener(this)
            button3.setOnClickListener(this)
            button4.setOnClickListener(this)
    }

    override fun onClick(v: View){

        val intent = Intent(this, ResultActivity::class.java)

        //if分でeditTextに何も入っていなかったときの処理
        if (editText1.text.toString().equals("") == true || editText2.text.toString().equals("") == true){
            textView2.text = "数値を入力してください"
        } else {

            val num1 = editText1.text.toString().toFloat()
            val num2 = editText2.text.toString().toFloat()

            if (v.id == R.id.button1) {
                val answer = num1 + num2
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            } else if (v.id == R.id.button2) {
                val answer = num1 - num2
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            } else if (v.id == R.id.button3) {
                val answer = num1 * num2
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            } else if (v.id == R.id.button4) {
                val answer = num1 / num2
                intent.putExtra("ANSWER", answer)
                startActivity(intent)
            }
        }
    }






}

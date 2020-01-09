package com.example.customlistviews

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        //รับข้อมูลจาก Intent

        var intent = intent
        val get_fullname = intent.getStringExtra("fn")
        val get_idstudent = intent.getStringExtra("id")
        val get_tel = intent.getStringExtra("tel")
        val get_email = intent.getStringExtra("email")
        val get_git = intent.getStringExtra("git")



        val fullname = findViewById<TextView>(R.id.display_fullname)
        val idstudent = findViewById<TextView>(R.id.display_id)
        val major = findViewById<TextView>(R.id.display_major)
        val telenumber = findViewById<TextView>(R.id.display_tel)
        val email = findViewById<TextView>(R.id.display_email)
        val github = findViewById<TextView>(R.id.display_github)
        val image = findViewById<ImageView>(R.id.display_img)



        fullname.text = get_fullname
        idstudent.text = "รหัสนักศึกษา "+get_idstudent
        major.text = "สาขาวิทยาการคอมพิวเตอร์และสารสนเทศ"
        telenumber.text = get_tel
        email.text = get_email
        github.text = get_git

        when (get_idstudent) {
            "603410061-2" -> image.setImageResource(R.drawable.tor)
            "603410208-8" -> image.setImageResource(R.drawable.tle)
            "603410289-2" -> image.setImageResource(R.drawable.boss)
            "603410059-9" -> image.setImageResource(R.drawable.riwjin)
            "603410213-5" -> image.setImageResource(R.drawable.kiw)
            else -> image.setImageResource(R.mipmap.ic_launcher)
        }



        //startActivity(intent)

    }
}

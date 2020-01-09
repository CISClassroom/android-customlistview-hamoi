package com.example.customlistviews

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.core.graphics.drawable.toDrawable
import androidx.core.os.bundleOf
import kotlinx.android.synthetic.main.row.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()
        listView.adapter = MyAdapter(this,R.layout.row,list)
        list.add(Model("วิธาน   วงษาบุตร","603410061-2",R.drawable.tor,"089-818-2239","withan@kkumail.com","https://github.com/wtt-kku"))
        list.add(Model("ปิยทัศน์ นวกิจวัฒนา","603410208-8",R.drawable.tle,"062-281-2737","piyatat@kkumail.com","https://github.com/piyatat-source"))
        list.add(Model("เกียรติศักดิ์ วรภาพ" ,"603410289-2" , R.drawable.boss,"093-481-3207","keadtisak_w@kkumail.com","https://github.com/Bosskeadtisak"))
        list.add(Model("รัฐเขต สีเหลือง","603410059-9",R.drawable.riwjin,"093-482-2938","Rattaket_seeluang@kkumail.com","https://github.com/rattket"))
        list.add(Model("วงษกร พันธ์พิบูลย์","603410213-5",R.drawable.kiw,"062-551-9544","wongskorn_p@kkumail.com","https://github.com/wongskorn"))
        listView.setOnItemClickListener { parent:AdapterView<*>, view:View, position:Int, id:Long ->
            if (position == 0)
            {
                val fullname = list[0].fullname
                val idstudent = list[0].idstudent
                val tele = list[0].tel
                val email = list[0].email
                val github = list[0].github
                val intent = Intent(this@MainActivity, DataActivity::class.java)
                intent.putExtra("fn",fullname)
                intent.putExtra("id",idstudent)
                intent.putExtra("tel",tele)
                intent.putExtra("email",email)
                intent.putExtra("git",github)
                startActivity(intent)
                //Toast.makeText(this@MainActivity,"BOSS",Toast.LENGTH_LONG).show()
            }
            if (position == 1)
            {
                val fullname = list[1].fullname
                val idstudent = list[1].idstudent
                val tele = list[1].tel
                val email = list[1].email
                val github = list[1].github
                val intent = Intent(this@MainActivity, DataActivity::class.java)
                intent.putExtra("fn",fullname)
                intent.putExtra("id",idstudent)
                intent.putExtra("tel",tele)
                intent.putExtra("email",email)
                intent.putExtra("git",github)
                startActivity(intent)
            }
            if (position == 2)
            {
                val fullname = list[2].fullname
                val idstudent = list[2].idstudent
                val tele = list[2].tel
                val email = list[2].email
                val github = list[2].github
                val intent = Intent(this@MainActivity, DataActivity::class.java)
                intent.putExtra("fn",fullname)
                intent.putExtra("id",idstudent)
                intent.putExtra("tel",tele)
                intent.putExtra("email",email)
                intent.putExtra("git",github)
                startActivity(intent)
            }
            if (position == 3)
            {
                val fullname = list[3].fullname
                val idstudent = list[3].idstudent
                val tele = list[3].tel
                val email = list[3].email
                val github = list[3].github
                val intent = Intent(this@MainActivity, DataActivity::class.java)
                intent.putExtra("fn",fullname)
                intent.putExtra("id",idstudent)
                intent.putExtra("tel",tele)
                intent.putExtra("email",email)
                intent.putExtra("git",github)
                startActivity(intent)
            }
            if (position == 4)
            {
                val fullname = list[4].fullname
                val idstudent = list[4].idstudent
                val tele = list[4].tel
                val email = list[4].email
                val github = list[4].github
                val intent = Intent(this@MainActivity, DataActivity::class.java)
                intent.putExtra("fn",fullname)
                intent.putExtra("id",idstudent)
                intent.putExtra("tel",tele)
                intent.putExtra("email",email)
                intent.putExtra("git",github)
                startActivity(intent)
            }
        }


    }
}



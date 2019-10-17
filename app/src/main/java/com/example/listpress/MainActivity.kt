package com.example.listpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Ir. Soekarno",   "presiden ke 1",   R.drawable.r1  ))
        list.add(Model("Soeharto",   "presiden ke 2 ",   R.drawable.r2  ))
        list.add(Model("Bacharuddin Jusuf Habibie", "presiden ke 3", R.drawable.r3  ))
        list.add(Model("Abdurrahman Wahid",  "presiden ke 4",  R.drawable.r4 ))
        list.add(Model("Megawati Soekarnoputri",  "presiden ke 5",  R.drawable.r5  ))
        list.add(Model("Susilo Bambang yudhoyono",  "presiden ke 6",  R.drawable.r6  ))
        list.add(Model("Joko Widodo",  "presiden ke 7",  R.drawable.r7  ))

        listView.adapter = MyListAdapter(this,R.layout.raw,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this@MainActivity, "Presiden Pertama",   Toast.LENGTH_LONG).show()
            }
            if (position==1){
                Toast.makeText(this@MainActivity, "Presiden Kedua",   Toast.LENGTH_LONG).show()
            }
            if (position==2){
                Toast.makeText(this@MainActivity, "Presiden Ketiga", Toast.LENGTH_LONG).show()
            }
            if (position==3){
                Toast.makeText(this@MainActivity, "Presiden Keempat",  Toast.LENGTH_LONG).show()
            }
            if (position==4){
                Toast.makeText(this@MainActivity, "Presiden Kelima",  Toast.LENGTH_LONG).show()
            }
            if (position==5){
                Toast.makeText(this@MainActivity, "Presiden Keenam",  Toast.LENGTH_LONG).show()
            }
            if (position==6){
                Toast.makeText(this@MainActivity, "Presiden Ketujuh",  Toast.LENGTH_LONG).show()
            }
        }
    }
}

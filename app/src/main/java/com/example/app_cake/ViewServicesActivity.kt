package com.example.app_cake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.TextView

class ViewServicesActivity : AppCompatActivity() {
    private val baker_details1 = arrayOf(
        arrayOf(
            "Baker Name : Emmanuel kitongin",
            "Bakery address : Kisumu",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Baker Name : Martin Krop",
            "Bakery address : Harambee",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Baker Name : Victor Mutinda",
            "Bakery address : Eldoret",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Baker Name : Ellah Danniela",
            "Bakery address : Chiromo",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Baker Name : Diana Chemtkaa",
            "Bakery address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
    private val baker_details2 = arrayOf(
        arrayOf(
            "Baker Name : Emmanuel kitongin",
            "Bakery address : Agha khan",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Baker Name : Martin Krop",
            "Bakery address : Kenyatta",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Baker Name : Victor Mutinda",
            "Bakery address : Eldoret",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Baker Name : Ellah Danniela",
            "Bakery address : Chiromo",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Baker Name : Diana Chemtkaa",
            "Bakery address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
    private val baker_details3 = arrayOf(
        arrayOf(
            "Baker Name : Emmanuel kitongin",
            "Bakery address : Agha khan",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Baker Name : Martin Krop",
            "Bakery address : Kenyatta",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Baker Name : Victor Mutinda",
            "Bakery address : Eldoret",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Baker Name : Ellah Danniela",
            "Bakery address : Chiromo",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Baker Name : Diana Chemtkaa",
            "Bakery address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
    private val baker_details4 = arrayOf(
        arrayOf(
            "Baker Name : Emmanuel kitongin",
            "Bakery address : Agha khan",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Baker Name : Martin Krop",
            "Bakery address : Kenyatta",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Baker Name : Victor Mutinda",
            "Bakery address : Eldoret",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Baker Name : Ellah Danniela",
            "Bakery address : Chiromo",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Baker Name : Diana Chemtkaa",
            "Bakery address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
    private val baker_details5 = arrayOf(
        arrayOf(
            "Baker Name : Emmanuel kitongin",
            "Bakery address : Agha khan",
            "Exp : 5years",
            "Mobile No:0710550123",
            "600"
        ),
        arrayOf(
            "Baker Name : Martin Krop",
            "Bakery address : Kenyatta",
            "Exp : 15years",
            "Mobile No:0726550125",
            "800"
        ),
        arrayOf(
            "Baker Name : Victor Mutinda",
            "Bakery address : Eldoret",
            "Exp : 4years",
            "Mobile No:0714550110",
            "500"
        ),
        arrayOf(
            "Baker Name : Ellah Danniela",
            "Bakery address : Chiromo",
            "Exp : 10years",
            "Mobile No:0716550124",
            "700"
        ),
        arrayOf(
            "Baker Name : Diana Chemtkaa",
            "Bakery address : Karen",
            "Exp : 6years",
            "Mobile No:0716550120",
            "900"
        )
    )
    lateinit var tv: TextView
    lateinit var btn: Button
    var baker_details = arrayOf<Array<String>>()
    var item: HashMap<String, String>? = null
    lateinit var list: ListView
    var sa: SimpleAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_services)

        tv = findViewById(R.id.txthadtitle)
        btn = findViewById(R.id.btnhadback)

        val it = intent
        val title = it.getStringExtra("title")
        tv.setText(title)

        baker_details =
            if (title!!.compareTo("Family physician") == 0) baker_details1 else if (title.compareTo(
                    "Dietician"
                ) == 0
            ) baker_details2 else if (title.compareTo("Dentist") == 0) baker_details3 else if (title.compareTo(
                    "Surgeon"
                ) == 0
            ) baker_details4 else baker_details5



        btn.setOnClickListener(View.OnClickListener {
            startActivity(
                Intent(
                    this@ViewServicesActivity,
                    ServicesActivity::class.java
                )
            )
        })

        val lst = findViewById<ListView>(R.id.listviewha)
        lst.adapter = sa

        lst.onItemClickListener =
            AdapterView.OnItemClickListener { adapterView, view, i, l ->
                val it = Intent(this@ViewServicesActivity, ServicesActivity::class.java)
                it.putExtra("text1", title)
                it.putExtra("text2", baker_details[i][0])
                it.putExtra("text3", baker_details[i][1])
                it.putExtra("text4", baker_details[i][3])
                it.putExtra("text5", baker_details[i][4])
                startActivity(it)
            }
    }

}
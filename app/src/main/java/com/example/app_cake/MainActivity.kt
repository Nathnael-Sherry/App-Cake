package com.example.app_cake

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {

    lateinit var editlocation: EditText
    lateinit var editservice: EditText
    lateinit var editprice: EditText
    lateinit var btnphoto: Button
    lateinit var btndata: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editlocation = findViewById(R.id.edt_location)
        editservice = findViewById(R.id.edt_service)
        editprice = findViewById(R.id.edt_service)
        btnphoto = findViewById(R.id.btn_photo)
        btndata = findViewById(R.id.btn_data)


        val database = FirebaseDatabase.getInstance()
        val databaseRef = database.getReference("cars")


        btndata.setOnClickListener {

            var viewcars = Intent(this, ViewServicesActivity::class.java)



        }

        btnphoto.setOnClickListener {
            var gotologin = Intent(this, ServicesActivity::class.java)
            startActivity(gotologin)
        }

//        btndata.setOnClickListener {
//            var gotologin = Intent(this, HomeActivity::class.java)
//            startActivity(gotologin)
//        }


        val location = editlocation.text.toString().trim()
        val service = editservice.text.toString().trim()
        val price = editprice.text.toString().trim()

        var id = System.currentTimeMillis().toString()

        var ref = database.getReference("baker/" + id)

        //validation
        if (location.isEmpty() || service.isEmpty() || price.isEmpty()) {
            Toast.makeText(this, "Cannot submit an empty field", Toast.LENGTH_SHORT).show()

        } else {

            //try to upload data to firebase
            val userService = Baker(location, service, price, id)
            //create a reference to firebaseDatabase

            val ref = FirebaseDatabase.getInstance().getReference().child("Baker")


            ref.setValue(userService).addOnCompleteListener {

                if (it.isSuccessful) {
                    Toast.makeText(
                        this, "Baker Data Uploaded Successfully",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(
                        this, "Failed tO Save Baker Info",
                        Toast.LENGTH_LONG
                    ).show()
                }

            }


        }

    }


}
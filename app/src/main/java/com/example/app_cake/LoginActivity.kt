package com.example.app_cake

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    lateinit var mail_lgn: EditText
    lateinit var pass_lgn: EditText
    lateinit var btn_login: Button
    lateinit var registerButton_lgn: Button
    lateinit var auth: FirebaseAuth

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        mail_lgn=findViewById(R.id.edtEmaillgn)
        pass_lgn=findViewById(R.id.edtPasslgn)
        btn_login=findViewById(R.id.btnLoginlgn)
        registerButton_lgn=findViewById(R.id.btnRegisterlgn)

        auth = FirebaseAuth.getInstance()

            btn_login.setOnClickListener {
            var email = mail_lgn.text.toString().trim()
            var password = pass_lgn.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Cannot Submit an Empty Field", Toast.LENGTH_SHORT).show()
            }else{
                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this){
                    if (it.isSuccessful){
                        Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()

                        //navigate a user to a different page
                        var gotohome = Intent(this, MainActivity::class.java)
                        startActivity(gotohome)
                        finish()
                    }else{
                        Toast.makeText(this, "Sorry failed to login", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }

        registerButton_lgn.setOnClickListener {
            //navigate user to the registration page
            var gotoregister = Intent(this, RegisterActivity::class.java)
            startActivity(gotoregister)

        }

    }
}
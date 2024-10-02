package com.example.livechat.viewModel

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LiveChatViewModel @Inject constructor(
    private val auth : FirebaseAuth
) : ViewModel() {


    //private val auth : FirebaseAuth = FirebaseAuth.getInstance()

    fun signup(
        context : Context,
        email : String,
        password : String
    ) {
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener() {
                task ->
                if (task.isSuccessful) Toast.makeText(context,"sing up successful", Toast.LENGTH_SHORT).show()
                else Toast.makeText(context,"sing up failed:  ${task.exception?.message}", Toast.LENGTH_LONG).show()
            }
    }


}
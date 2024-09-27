package com.example.livechat.viewModel

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LiveChatViewModel @Inject constructor(
    private val auth : FirebaseAuth
) : ViewModel() {

    fun signUp (
        name : String,
        email : String,
        number: String,
        password : String,
        context : Context
    ) {
        auth.createUserWithEmailAndPassword(email,password)
            .addOnCompleteListener{
                if (it.isSuccessful) {
                    Log.d(TAG,"User created Successfully ")

                }else {
                    Log.w(TAG,"User Creation Failed")
                    Toast.makeText(context,"User Creation Failed ", Toast.LENGTH_SHORT).show()
                }
            }

    }
}
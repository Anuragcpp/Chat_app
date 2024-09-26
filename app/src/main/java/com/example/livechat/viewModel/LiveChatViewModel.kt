package com.example.livechat.viewModel

import android.util.Log
import androidx.lifecycle.ViewModel
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
        password : String
    ) {
        auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
            if (it.isSuccessful) {
                Log.d("TAG", "signup : User Logged IN")
            }
        }
    }
}
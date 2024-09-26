package com.example.livechat.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.livechat.R
import com.example.livechat.utality.endpoints.DistinationScreen
import com.example.livechat.utality.navigateTo
import com.example.livechat.viewModel.LiveChatViewModel

@Composable
fun SignUpScreen(
    viewModel: LiveChatViewModel,
    navController: NavController
) {



    @OptIn(ExperimentalMaterial3Api::class)
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentHeight()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            var nameState by remember { mutableStateOf(TextFieldValue()) }
            var numberState by remember { mutableStateOf(TextFieldValue()) }
            var passwordState by remember { mutableStateOf(TextFieldValue()) }
            var emailState by remember { mutableStateOf(TextFieldValue()) }
            val focus = LocalFocusManager.current



            Image(
                painter = painterResource(id = R.drawable.chat_icn),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 16.dp)
                    .padding(8.dp)
                    .width(150.dp)
            )

            Text(
                text = "Sing Up",
                fontSize = 30.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )

            OutlinedTextField(
                value = nameState ,
                onValueChange = { nameState = it},
                label = { Text(text = "Name")}
            )

            OutlinedTextField(
                value = emailState ,
                onValueChange = { emailState = it},
                label = { Text(text = "email")}
            )

            OutlinedTextField(
                value = numberState ,
                onValueChange = { numberState = it},
                label = { Text(text = "Number")}
            )

            OutlinedTextField(
                value = passwordState ,
                onValueChange = { passwordState = it},
                label = { Text(text = "Password")}
            )
            
            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)
            ) {
                
                Text(text = "Sign Up")
                
            }
            
            Text(
                text = "Alrady a User ? Go to Login -> ",
                color = Color.Blue,
                modifier = Modifier.padding(8.dp)
                    .clickable {
                        navigateTo(
                            navController  = navController,
                            route =  DistinationScreen.Login.route
                        )
                    }
                )

        }

    }

}
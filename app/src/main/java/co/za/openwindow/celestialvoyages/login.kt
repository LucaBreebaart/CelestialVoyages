package co.za.openwindow.celestialvoyages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.za.openwindow.celestialvoyages.ui.theme.CelestialVoyagesTheme


@Composable
fun LoginScreen(modifier: Modifier = Modifier) {

    Column(
        verticalArrangement = Arrangement.spacedBy((-30.dp), Alignment.Top),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            modifier = Modifier
                .width(428.dp)
                .height(256.dp)
                .background(color = Color(0x59180C60)),
            painter = painterResource(id = R.drawable.header),
            contentDescription = "header image",
            contentScale = ContentScale.Crop
        )


        Column(
            verticalArrangement = Arrangement.spacedBy(20.dp, Alignment.Top),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = Color(0xFF090011), shape = RoundedCornerShape(30.dp, 30.dp, 0.dp, 0.dp)
                )
                .padding(start = 30.dp, end = 30.dp)
                .offset(y =-50.dp)
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .width(115.dp)
                    .height(115.dp)
                    .background(color = Color(0xFFF2994A), shape = RoundedCornerShape(size = 60.dp))
            ) {
                Image(
                    modifier = Modifier
                        .width(78.dp)
                        .height(78.dp),
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "image description",
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = "Login", style = TextStyle(
                        fontSize = 56.sp,
                        lineHeight = 61.6.sp,
                        fontFamily = FontFamily(Font(R.font.bebasneue)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 3.92.sp,
                    )
                )

                Text(
                    text = "Explore the galaxy", style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFFFFFFF),
                    )
                )
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,

                ) {
                Text(
                    text = "Your email", style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 22.sp,
                        fontFamily = FontFamily(Font(R.font.inter)), // Make sure to add the appropriate font resource
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                    )
                )

                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedTextColor = Color.White,
                        unfocusedBorderColor = Color.White,
                        unfocusedLabelColor = Color.White,
                        unfocusedLeadingIconColor = Color.White
                    ),
                    value = "eg. martian@space.com",
                    shape = RoundedCornerShape(50.dp),
                    onValueChange = {})
            }

            Column(
                verticalArrangement = Arrangement.spacedBy(10.dp, Alignment.Top),
                horizontalAlignment = Alignment.Start,
            ) {
                Text(
                    text = "Password", style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 22.sp,
                        fontFamily = FontFamily(Font(R.font.inter)), // Make sure to add the appropriate font resource
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                    )
                )

                OutlinedTextField(
                    modifier = Modifier.fillMaxWidth(),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedTextColor = Color.White,
                        unfocusedBorderColor = Color.White,
                        unfocusedLabelColor = Color.White,
                        unfocusedLeadingIconColor = Color.White
                    ),
                    value = "******",
                    shape = RoundedCornerShape(50.dp),
                    onValueChange = {})
            }

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp, Alignment.Start),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box(
                        modifier = Modifier
                            .border(
                                width = 2.dp,
                                color = Color(0xFFFFFFFF),
                                shape = RoundedCornerShape(size = 5.dp)
                            )
                            .size(23.dp)
                    )
                    Text(
                        text = "Remember Me", style = TextStyle(
                            fontSize = 12.sp,
                            lineHeight = 22.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(400),
                            color = Color(0xFFFFFFFF),
                        )
                    )

                }

                Text(
                    text = "Forgot password?",
                    style = TextStyle(
                        fontSize = 12.sp,
                        lineHeight = 22.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(700),
                        color = Color(0xFFF2994A),
                        textAlign = TextAlign.Right,
                    )
                )

            }

            Button(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(284.dp)
                    .height(53.dp)
                    .background(
                        color = Color(0xFF7920C2), shape = RoundedCornerShape(size = 100.dp)
                    ),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(
                        10.dp,
                        Alignment.CenterHorizontally
                    )
                ) {
                    Text(text = "Login", color = Color.White)
                }

            }

            Row {
                Text(
                    text = "Already have an account? ",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 22.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                    )
                )
                Text(
                    text = " Sign Up",
                    style = TextStyle(
                        fontSize = 16.sp,
                        lineHeight = 22.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(400),
                        color = Color(0xFFF2994A),
                        textAlign = TextAlign.Center,
                    )
                )
            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginPreview() {
    CelestialVoyagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
        ) {
            LoginScreen()
        }

    }
}
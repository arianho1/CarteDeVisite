package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteDeVisiteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Transparent
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    val backgroundGradient = Brush.verticalGradient(
        colors = listOf(Color(0xFFB2FF59), Color(0xFF56AB91)),
        startY = 0f,
        endY = 1000f
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundGradient),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .width(350.dp)
                .shadow(16.dp, RoundedCornerShape(24.dp))
                .background(Color.White.copy(alpha = 0.97f), RoundedCornerShape(24.dp))
                .padding(vertical = 40.dp, horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "Photo de profil",
                modifier = Modifier
                    .size(110.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color(0xFF388E3C), CircleShape)
            )

            Spacer(modifier = Modifier.height(18.dp))

            Text(
                text = "Kpai Arnaud Devai",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF1B5E20),
                textAlign = TextAlign.Center
            )

            Text(
                text = "Développeur Mobile / Fullstack",
                fontSize = 18.sp,
                color = Color(0xFF2E7D32),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(18.dp))

            HorizontalDivider(
                modifier = Modifier.padding(horizontal = 16.dp),
                thickness = 1.dp,
                color = Color(0xFFB2DFDB)
            )

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_phone),
                    contentDescription = "Téléphone",
                    modifier = Modifier.size(22.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "07 11 90 60 52",
                    fontSize = 16.sp,
                    color = Color(0xFF424242)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_email),
                    contentDescription = "Email",
                    modifier = Modifier.size(22.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "arianhokpai@icloud.com",
                    fontSize = 16.sp,
                    color = Color(0xFF424242)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.github),
                    contentDescription = "GitHub",
                    modifier = Modifier.size(22.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "@arianho1",
                    fontSize = 16.sp,
                    color = Color(0xFF424242)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_location),
                    contentDescription = "Localisation",
                    modifier = Modifier.size(22.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text(
                    text = "Yamoussoukro",
                    fontSize = 16.sp,
                    color = Color(0xFF424242)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    CarteDeVisiteTheme {
        BusinessCard()
    }
}

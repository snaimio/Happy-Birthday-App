package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayCardContent()
                }
            }
        }
    }
}

@Composable
fun BirthdayCardContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF0F5)), // Lavender blush background
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .padding(horizontal = 32.dp, vertical = 24.dp)
                .width(350.dp) // Limit width for better text wrapping
        ) {
            // Top decoration
            Text(
                text = "✨",
                fontSize = 40.sp,
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // "Happy Birthday" text
            Text(
                text = "Happy Birthday",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFD63384),
                textAlign = TextAlign.Center,
                lineHeight = 44.sp, // Add line height
                modifier = Modifier.padding(bottom = 4.dp)
            )

            // "Hafsa!" text
            Text(
                text = "Hafsa!",
                fontSize = 48.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFF6A1B9A),
                textAlign = TextAlign.Center,
                lineHeight = 56.sp, // Add line height
                modifier = Modifier.padding(bottom = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Decorative divider
            Text(
                text = "🎂",
                fontSize = 36.sp,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            // First message line
            Text(
                text = "Wishing you all the best",
                fontSize = 18.sp,
                color = Color(0xFF6A1B9A),
                textAlign = TextAlign.Center,
                lineHeight = 28.sp,
                modifier = Modifier.padding(bottom = 2.dp)
            )

            // Second message line
            Text(
                text = "on your special day! 🎉",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFD63384),
                textAlign = TextAlign.Center,
                lineHeight = 32.sp
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Bottom decoration
            Text(
                text = "❤️",
                fontSize = 36.sp
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFFFF0F5, widthDp = 360, heightDp = 800)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        BirthdayCardContent()
    }
}
package com.example.latihan_2.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun HeaderInfo(
    nim: String = "245150407111070",
    nama: String = "Faliha Auliya"
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text = "NIM  : $nim")
        Text(text = "Nama : $nama")
        Divider(modifier = Modifier.padding(top = 8.dp))
    }
}
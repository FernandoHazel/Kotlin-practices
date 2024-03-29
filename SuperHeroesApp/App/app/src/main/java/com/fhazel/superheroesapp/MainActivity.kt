package com.fhazel.superheroesapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fhazel.superheroesapp.data.heroes
import com.fhazel.superheroesapp.ui.theme.SuperHeroesAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SuperHeroesAppTheme {
                HeroesApp()
            }
        }
    }
}

@Composable
fun HeroesApp(){
    Scaffold (
        topBar = {
            TopBar()
        }
    ){it->
        HeroesList(heroes, it)
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SuperHeroesAppTheme {
        HeroesApp()
    }
}
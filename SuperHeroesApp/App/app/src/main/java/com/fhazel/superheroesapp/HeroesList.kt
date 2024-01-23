package com.fhazel.superheroesapp

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import com.fhazel.superheroesapp.data.heroes
import com.fhazel.superheroesapp.model.Hero
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fhazel.superheoesapp.R
import com.fhazel.superheroesapp.ui.theme.SuperHeroesAppTheme

@Composable
fun HeroesList(heroesList: List<Hero>, contentPadding: PaddingValues, modifier: Modifier = Modifier){
    LazyColumn(
        contentPadding = contentPadding,
        modifier = modifier
    ){
        items(heroesList){hero ->
            HeroCard(
                hero = hero,
                modifier = modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }
    }
}

@Preview
@Composable
fun HeroesListPreview(){
    val paddingValues = PaddingValues(
        horizontal = 16.dp,
        vertical = 8.dp
    )
    HeroesList(heroes, paddingValues)
}
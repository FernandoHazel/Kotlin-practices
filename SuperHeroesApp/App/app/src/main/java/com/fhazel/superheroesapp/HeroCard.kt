package com.fhazel.superheroesapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fhazel.superheoesapp.R
import com.fhazel.superheroesapp.model.Hero

@Composable
fun HeroCard(
    hero: Hero,
    modifier: Modifier = Modifier
){
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        modifier = modifier,
    ){

        Row(
            modifier = modifier
                .fillMaxWidth()
                .sizeIn(minHeight = 72.dp)
                .padding(dimensionResource(R.dimen.padding_medium))
                .clip(MaterialTheme.shapes.medium)

        ) {
            Column (modifier = Modifier.weight(1f)){
                Text(
                    text = stringResource(hero.nameRes),
                    style = MaterialTheme.typography.displaySmall
                )
                Text(
                    text = stringResource(hero.descriptionRes),
                    style = MaterialTheme.typography.bodyLarge
                )
            }
            Spacer(modifier = Modifier.width(dimensionResource(R.dimen.padding_medium)))

            Image(
                painter = painterResource(hero.imageRes),
                contentDescription = null,
                modifier = modifier
                    .size(72.dp)
                    .clip(MaterialTheme.shapes.small)
            )

        }
    }
}

@Preview
@Composable
fun HeroScreenPreview(){
    val testHero = Hero(
        nameRes = R.string.hero1,
        descriptionRes =  R.string.description1,
        imageRes =  R.drawable.android_superhero1
    )
    HeroCard(hero = testHero)
}
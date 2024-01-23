package com.fhazel.composecuadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.fhazel.composecuadrant.ui.theme.ComposeCuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Grid()
                }
            }
        }
    }
}

// The grid is made of a colum with two rows of quadrants
@Composable
fun Grid() {
    Column (Modifier.fillMaxWidth()){
        Row (Modifier.weight(1f)){
            Quadrant(
                title = stringResource(id = R.string.text_title),
                description = stringResource(id = R.string.text_description),
                color = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = stringResource(id = R.string.image_title),
                description = stringResource(id = R.string.image_description),
                color = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (Modifier.weight(1f)){
            Quadrant(
                title = stringResource(id = R.string.row_title),
                description = stringResource(id = R.string.column_description),
                color = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            Quadrant(
                title = stringResource(id = R.string.column_title),
                description = stringResource(id = R.string.column_description),
                color = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

// This is the box of each element
@Composable
fun Quadrant(
    title: String,
    description: String,
    color: Color,
    modifier: Modifier = Modifier){

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GridPreview(){
    ComposeCuadrantTheme{
        Grid()
    }
}
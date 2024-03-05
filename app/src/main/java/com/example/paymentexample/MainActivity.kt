package com.example.paymentexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.paymentexample.ui.theme.PaymentExampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PaymentExampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 50.dp, vertical = 50.dp),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(R.string.payment_gate)
                }
            }
        }
    }
}

@Composable
fun Greeting(
    name: Int,
    modifier: Modifier = Modifier
) {
    val paymentName = stringResource(id = name)
    Text(
        text = "you are using $paymentName",
        modifier = modifier,
        fontSize = 18.sp
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PaymentExampleTheme {
        Greeting(R.string.payment_gate)
    }
}
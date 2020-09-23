package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
public void convert (View view){

    Log.i("USD","convert start");
    EditText usd = (EditText)findViewById(R.id.usdEditText);
    String usdnew = usd.getText().toString();
    double inr = 70.00;
    int usdnew1 = Integer.parseInt(usdnew);
    double conversion = usdnew1 * inr;
    Toast.makeText(this,"INR Amount : "+ conversion,Toast.LENGTH_LONG).show();
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
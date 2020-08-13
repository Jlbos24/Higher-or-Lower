package com.example.higherorlower;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.concurrent.ThreadLocalRandom;

public class MainActivity extends AppCompatActivity {


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public static int getRandomValue(int Min, int Max) {
        final int ranValue = ThreadLocalRandom.current().nextInt(Min, Max);
        return ranValue;
    }
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void btnCheck(View view) {
        EditText edtNumber = (EditText) findViewById(R.id.edtNumber);
        int Min = 1;
        int Max = 20;
        double randomNumber = getRandomValue(Min, Max);
        int checkNum = Integer.parseInt(edtNumber.getText().toString());

        if (checkNum > randomNumber){
            Toast.makeText(this, checkNum + " is higher than " + randomNumber, Toast.LENGTH_LONG).show();
        } else if (checkNum == randomNumber) {
            Toast.makeText(this, checkNum + " is equal to " + randomNumber, Toast.LENGTH_LONG).show();
        } else Toast.makeText(this, checkNum + " is lower than " + randomNumber, Toast.LENGTH_LONG).show();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
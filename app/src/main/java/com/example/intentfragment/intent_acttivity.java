package com.example.intentfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class intent_acttivity extends AppCompatActivity implements View.OnClickListener {

    Button balik_lagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_acttivity);
        balik_lagi = (Button)findViewById(R.id.balik_lagi);
        balik_lagi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent balikLagi = new Intent(this,MainActivity.class);
        startActivity(balikLagi);
    }
}

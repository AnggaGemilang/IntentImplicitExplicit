package com.example.intentfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button implicit_button;
    Button explicit_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        explicit_button = (Button)findViewById(R.id.explicit_button);
        explicit_button.setOnClickListener(this);
        implicit_button = (Button)findViewById(R.id.implicit_button);
        implicit_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        switch (view.getId()){
            case R.id.explicit_button:
                Intent Explicit = new Intent(MainActivity.this,intent_acttivity.class);
                startActivity(Explicit);
                break;
            case R.id.implicit_button:
                Intent Implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/?hl=id"));
                startActivity(Implicit);
                break;
            default:
                    break;
        }
    }
}

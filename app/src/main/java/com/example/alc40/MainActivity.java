package com.example.alc40;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View v = findViewById(R.id.button);
        v.setOnClickListener(this);

        View m = findViewById(R.id.button2);
        m.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button) {
            //define a new Intent for the second Activity
            Intent intent = new Intent(this, AboutActivity.class);

            //start the second Activity
            this.startActivity(intent);
        }else if(view.getId() == R.id.button2){
            //define a new Intent for the second Activity
                Intent intent = new Intent(this, ProfileActivity.class);

        //start the second Activity
        this.startActivity(intent);
        }
    }



}

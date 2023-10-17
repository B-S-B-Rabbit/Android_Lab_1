package com.example.android_lab_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;

public class SecondActivity extends AppCompatActivity {

    private RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        layout = findViewById(R.id.secondActivityLayout);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("color")) {
            String selectedColor = intent.getStringExtra("color");
            if (selectedColor.equals("red")) {
                layout.setBackgroundColor(Color.RED);
            } else if (selectedColor.equals("green")) {
                layout.setBackgroundColor(Color.GREEN);
            } else if (selectedColor.equals("blue")) {
                layout.setBackgroundColor(Color.BLUE);
            }
        }
    }
}

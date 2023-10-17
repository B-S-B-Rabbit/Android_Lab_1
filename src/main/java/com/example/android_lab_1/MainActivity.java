package com.example.android_lab_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText colorEditText;
    private Button launchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorEditText = findViewById(R.id.colorEditText);
        launchButton = findViewById(R.id.launchButton);

        launchButton.setOnClickListener(view -> {
            String selectedColor = colorEditText.getText().toString().toLowerCase();
            if (selectedColor.equals("red") || selectedColor.equals("green") || selectedColor.equals("blue")) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("color", selectedColor);
                startActivity(intent);
            } else {
                Toast.makeText(MainActivity.this, "Введите 'red', 'green' или 'blue'", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

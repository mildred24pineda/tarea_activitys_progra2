package com.example.tarea_activitys;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnText, btnBotones, btnWidgets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnText = findViewById(R.id.btnText);
        btnBotones = findViewById(R.id.btnBotones);
        btnWidgets = findViewById(R.id.btnWidgets);

        btnText.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TextActivity.class);
            startActivity(intent);
        });

        btnBotones.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ButtonActivity.class);
            startActivity(intent);
        });

        btnWidgets.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, WidgetsActivity.class);
            startActivity(intent);
        });
    }
}

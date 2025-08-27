package com.example.tarea_activitys;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class WidgetsActivity extends AppCompatActivity {

    CheckBox chk1, chk2;
    Switch sw;
    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);

        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        sw = findViewById(R.id.sw);
        btnRegresar = findViewById(R.id.btnRegresar);

        chk1.setOnClickListener(v ->
                Toast.makeText(this, "Opción 1: " + chk1.isChecked(), Toast.LENGTH_SHORT).show());

        chk2.setOnClickListener(v ->
                Toast.makeText(this, "Opción 2: " + chk2.isChecked(), Toast.LENGTH_SHORT).show());

        sw.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, "Switch: " + isChecked, Toast.LENGTH_SHORT).show());

        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(WidgetsActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}

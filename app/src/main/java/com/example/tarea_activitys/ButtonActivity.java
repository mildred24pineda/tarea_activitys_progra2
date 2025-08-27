package com.example.tarea_activitys;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ButtonActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btnRegresar = findViewById(R.id.btnRegresar);

        btn1.setOnClickListener(v -> btn1.setText("¡Me diste clic!"));
        btn2.setOnClickListener(v -> btn2.setText("¡Gracias!"));
        btn3.setOnClickListener(v -> btn3.setText("¡Funciona!"));

        btnRegresar.setOnClickListener(v -> {
            Intent intent = new Intent(ButtonActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        });
    }
}

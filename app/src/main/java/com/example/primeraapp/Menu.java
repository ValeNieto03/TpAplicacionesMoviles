package com.example.primeraapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Menu extends AppCompatActivity {
    Button btnAcercaDe, btnSalir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnAcercaDe = findViewById(R.id.btnAcercaDe);
        btnAcercaDe.setOnClickListener(v -> {
            Intent intent = new Intent(Menu.this, AcercaDe.class);
            startActivity(intent);
        });

        btnSalir = findViewById(R.id.btnSalir);
        btnSalir.setOnClickListener(v -> {
            Intent intent = new Intent(Menu.this, MainActivity.class);
            startActivity(intent);
        });
    }
}

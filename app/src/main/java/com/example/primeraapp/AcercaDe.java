package com.example.primeraapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AcercaDe extends AppCompatActivity {
    Button btnVolver, btnContacto, btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acerca_de);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> {
            Intent intent = new Intent(AcercaDe.this, Menu.class); // Asegúrate de cambiar "Menu" por el nombre correcto de tu clase de actividad.
            startActivity(intent);
        });

        btnContacto = findViewById(R.id.btnContacto);
        btnContacto.setOnClickListener(v -> {
            String Telefono = "2954397844";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:" + Telefono));
            startActivity(intent);
        });

        btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(v -> {
            String Correo = "valentinanieto558@gmail.com";
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            Uri Email = Uri.parse("mailto:" + Correo);
            intent.setData(Email);
            startActivity(intent);
        });
    }
}

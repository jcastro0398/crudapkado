package com.ejemplo.crudado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class PreBienvenidaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prebienvenida);
    }

    public void goToRegistro(View view) {
        // Aquí se dirigiría a la actividad de Registro
        // Intent intent = new Intent(this, RegistroActivity.class);
        // startActivity(intent);
    }

    public void goToHistoria(View view) {
        // Aquí se dirigiría a la actividad de Historia
        // Intent intent = new Intent(this, HistoriaActivity.class);
        // startActivity(intent);
    }
}
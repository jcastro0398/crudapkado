package com.ejemplo.crudado;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NuevoUsuarioActivity extends AppCompatActivity {

    private EditText etNombre, etApellido, etCorreo, etDireccion;
    private Button btnGuardarUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_usuario);

        etNombre = findViewById(R.id.et_nombre);
        etApellido = findViewById(R.id.et_apellido);
        etCorreo = findViewById(R.id.et_correo);
        etDireccion = findViewById(R.id.et_direccion);
        btnGuardarUsuario = findViewById(R.id.btn_guardar_usuario);

        btnGuardarUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString();
                String apellido = etApellido.getText().toString();
                String correo = etCorreo.getText().toString();
                String direccion = etDireccion.getText().toString();

                if (!nombre.isEmpty() && !apellido.isEmpty() && !correo.isEmpty() && !direccion.isEmpty()) {
                    // Aquí se guardaría el nuevo usuario
                    Toast.makeText(NuevoUsuarioActivity.this, "Usuario guardado con éxito", Toast.LENGTH_SHORT).show();
                    finish(); // Regresa a la pantalla anterior
                } else {
                    Toast.makeText(NuevoUsuarioActivity.this, "Por favor, complete todos los campos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
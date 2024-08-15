package com.ejemplo.crudado;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsuario, etClave;
    private TextView tvError;
    private Button btnIngresar, btnNuevoUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsuario = findViewById(R.id.et_usuario);
        etClave = findViewById(R.id.et_clave);
        tvError = findViewById(R.id.tv_error);
        btnIngresar = findViewById(R.id.btn_ingresar);
        btnNuevoUsuario = findViewById(R.id.btn_nuevo_usuario);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = etUsuario.getText().toString();
                String clave = etClave.getText().toString();

                if (usuario.equals("admin") && clave.equals("1234")) {
                    Intent intent = new Intent(LoginActivity.this, PreBienvenidaActivity.class);
                    startActivity(intent);
                    finish();
                } else {
                    tvError.setVisibility(View.VISIBLE);
                }
            }
        });

        btnNuevoUsuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, NuevoUsuarioActivity.class);
                startActivity(intent);
            }
        });
    }
}
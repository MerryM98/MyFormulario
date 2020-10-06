package com.example.myformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nombre,apellidos,edad,correo;
    Button aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre      = (EditText)findViewById(R.id.editEdad);
        apellidos   = (EditText)findViewById(R.id.editApellido);
        edad        = (EditText)findViewById(R.id.editEdad);
        correo      = (EditText)findViewById(R.id.editCorreo);
        aceptar     = (Button) findViewById(R.id.btnAceptar);

        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nombre.getText().toString();
                String ape = apellidos.getText().toString();
                String age = edad.getText().toString();
                String email = correo.getText().toString();

                Intent i = new Intent(MainActivity.this, MostarDatos.class);

                i.putExtra( "name", name);
                i.putExtra( "ape", age);
                i.putExtra( "age", age);
                i.putExtra( "email", email);

                startActivity(i );
            }
        });
    }
}
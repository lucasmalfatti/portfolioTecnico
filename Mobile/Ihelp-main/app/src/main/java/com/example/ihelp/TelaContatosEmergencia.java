package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaContatosEmergencia extends AppCompatActivity {
    EditText numero1, numero2, numero3, nomeNumero1, nomeNumero2, nomeNumero3;
    static Usuario logado;
    TextView campoNumero1, campoNumero2, campoNumero3, campoNomeNumero1, campoNomeNumero2, campoNomeNumero3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_contatos_de_emergencia);
        getSupportActionBar().hide();

        campoNumero1 =(TextView)findViewById(R.id.numero1);
        campoNumero1.setText(logado.numero1);

        campoNumero2 =(TextView)findViewById(R.id.numero2);
        campoNumero2.setText(logado.numero2);

        campoNumero3 =(TextView)findViewById(R.id.numero3);
        campoNumero3.setText(logado.numero3);

        campoNomeNumero1 =(TextView)findViewById(R.id.nomeNumero1);
        campoNomeNumero1.setText(logado.nomeNumero1);

        campoNomeNumero2 =(TextView)findViewById(R.id.nomeNumero2);
        campoNomeNumero2.setText(logado.nomeNumero2);

        campoNomeNumero3 =(TextView)findViewById(R.id.nomeNumero3);
        campoNomeNumero3.setText(logado.nomeNumero3);


    }


    public void salvar1(View view) {
        Usuario u = logado;
        numero1 = findViewById(R.id.numero1);
        String n1 = numero1.getText().toString();
        u.setNumero1(n1);

        numero2 = findViewById(R.id.numero2);
        String n2 = numero2.getText().toString();
        u.setNumero2(n2);

        numero3 = findViewById(R.id.numero3);
        String n3 = numero3.getText().toString();
        u.setNumero3(n3);

        nomeNumero1 = findViewById(R.id.nomeNumero1);
        String nN1 = campoNomeNumero1.getText().toString();
        u.setNomeNumero1(nN1);

        nomeNumero2 = findViewById(R.id.nomeNumero2);
        String nN2 = campoNomeNumero2.getText().toString();
        u.setNomeNumero2(nN2);

        nomeNumero3 = findViewById(R.id.nomeNumero3);
        String nN3 = campoNomeNumero3.getText().toString();
        u.setNomeNumero3(nN3);

        u.salvarInfo();

        Intent y = new Intent(this, TelaColetarDados.class);
        startActivity(y);
    }
}
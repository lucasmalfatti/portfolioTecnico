package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TelaDeVendas extends AppCompatActivity {

    static Usuario logado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_de_vendas);
        getSupportActionBar().hide();

    }

    public void salvarPlano1(View view) {
        Usuario u = logado;
        u.setPlanoContratado("Plano ConfortMax 49.90/mês");
        u.salvarInfo();
        Intent y = new Intent(this, BotaoEmergencia.class);
        startActivity(y);
    }



    public void salvarPlano2(View view) {
        Usuario u = logado;
        u.setPlanoContratado("Plano ConfortPlus 89.90/mês");
        u.salvarInfo();
        Intent y = new Intent(this, BotaoEmergencia.class);
        startActivity(y);
    }

}
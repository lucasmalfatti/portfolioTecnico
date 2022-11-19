package com.example.urna;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    EditText cpf;
    Usuario u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        cpf = (findViewById(R.id.campocpf));
        String c = cpf.getText().toString();
        u = new Usuario(c, 0);


    }

    public void mudaTela(){
        Intent i = new Intent(this, Votacao.class);
        startActivity(i);
    }

    public void verificaCpf(View view){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("CPF");
        reference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                 for (DataSnapshot a : snapshot.getChildren());{
                     String c = cpf.getText().toString();
                     for (DataSnapshot usuarios : snapshot.getChildren()){
                         if (a.getValue(Usuario.class).getCpf().equals || u.aux = 0){
                                mudaTela();
                                u.aux = 1;

                         }else{
                             cpf.setText("CPF inválido!");
                         }
                    }
                }
                }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

    public void botao1(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"1");
    }
    public void botao2(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"2");
    }
    public void botao3(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"3");
    }
    public void botao4(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"4");
    }
    public void botao5(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"5");
    }
    public void botao6(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"6");
    }
    public void botao7(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"7");
    }
    public void botao8(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"8");
    }
    public void botao9(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"9");
    }
    public void botao0(View v){
        String digito = cpf.getText()+"";
        cpf.setText(digito+"0");
    }
    public void corrigir(View v){
        String digito = "";
        cpf.setText(digito);
    }
    public void confirmar(View v) {
        Toast.makeText(this, "Escolha seu candidato!", Toast.LENGTH_SHORT).show();
        Intent b = new Intent(this, Votacao.class);
        startActivity(b);

    }
}
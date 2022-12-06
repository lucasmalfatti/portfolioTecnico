package com.example.ihelp;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class TelaLogin extends AppCompatActivity {
    EditText emailogin, senhalogin;
    static Usuario logado;
    AlertDialog.Builder alerta;
    Usuario u = new Usuario();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);
        emailogin = findViewById(R.id.emailogin);
        senhalogin = findViewById(R.id.senhalogin);
        alerta = new AlertDialog.Builder(this);

        getSupportActionBar().hide();
    }

    public void mudarTela() {
        Intent a = new Intent(this, TelaColetarDados.class);
        startActivity(a);
    }
    public void irCadastro(View v){
        Intent i = new Intent(this, TelaCadastro.class);
        startActivity(i);
    }



    public void print(String p) {
        Toast.makeText(this, p, Toast.LENGTH_LONG).show();
    }

    public void verfica_usuario(View view) {
        TelaInfoPessoais.logado = null;
        TelaLogin.logado = null;
        TelaInfoSaude.logado = null;
        TelaContatosEmergencia.logado = null;
        TelaDeVendas.logado = null;


        DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("Usuarios");
        reference.addValueEventListener(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String mensagem = "";
                String l = emailogin.getText().toString();
                String s = senhalogin.getText().toString();
                if (TelaLogin.logado == null

                ){
                    for (DataSnapshot d : snapshot.getChildren()) {
                        if(!TextUtils.isEmpty(l) && !TextUtils.isEmpty(s)){
                            int senhalogin_int = Integer.parseInt(senhalogin.getText().toString());
                            if (d.getValue(Usuario.class).getLogin().equals(l) && d.getValue(Usuario.class).getSenha() == senhalogin_int && verificaFormatoEmail(l)) {
                                TelaInfoPessoais.logado = d.getValue(Usuario.class);
                                TelaLogin.logado = d.getValue(Usuario.class);
                                TelaInfoSaude.logado = d.getValue(Usuario.class);
                                TelaContatosEmergencia.logado = d.getValue(Usuario.class);
                                TelaDeVendas.logado = d.getValue(Usuario.class);
                                TelaColetarDados.logado = d.getValue(Usuario.class);


                                mudarTela();
                                mensagem = "Seja bem vindo!";
                                break;

                            }else{
                                mensagem = "Usuário nao encontrado!";
                            }
                        } else{
                            mensagem = "Preencha todos os campos!";
                        }
                    }
                    if (!mensagem.isEmpty()){
                        print(mensagem);

                    }

                }




            }



            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }

        });


    }

    public boolean verificaFormatoEmail(String l){
        if(!l.contains("@")){
            return false;
        }
        return true;
    }


}
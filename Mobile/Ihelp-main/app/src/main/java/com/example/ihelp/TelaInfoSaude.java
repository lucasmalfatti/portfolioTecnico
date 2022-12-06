package com.example.ihelp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TelaInfoSaude extends AppCompatActivity {
    EditText doencasQuePossui, alergias, medicamentosQueFazUso, tipoSanguineo;
    static Usuario logado;
    TextView campoDoencasQuePossui, campoAlergias, campoMedicamentosQueFazUso,campoTipoSanguineo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_info_saude);
        getSupportActionBar().hide();

        campoDoencasQuePossui =(TextView)findViewById(R.id.doencasQuePossui);
        campoDoencasQuePossui.setText(logado.doencasQuePossui);

        campoAlergias =(TextView)findViewById(R.id.Alergia);
        campoAlergias.setText(logado.alergias);

        campoMedicamentosQueFazUso =(TextView)findViewById(R.id.Medicamentos);
        campoMedicamentosQueFazUso.setText(logado.medicamentosQueFazUso);

        campoTipoSanguineo =(TextView)findViewById(R.id.TpSanguineo);
        campoTipoSanguineo.setText(logado.tipoSanguineo);

    }

    public void salvar1(View view) {
        Usuario u = logado;
        doencasQuePossui = findViewById(R.id.doencasQuePossui);
        String dp = doencasQuePossui.getText().toString();
        u.setDoencasQuePossui(dp);

        alergias = findViewById(R.id.Alergia);
        String al = alergias.getText().toString();
        u.setAlergias(al);

        medicamentosQueFazUso = findViewById(R.id.Medicamentos);
        String md = medicamentosQueFazUso.getText().toString();
        u.setMedicamentosQueFazUso(md);

        tipoSanguineo = findViewById(R.id.TpSanguineo);
        String ts = tipoSanguineo.getText().toString();
        u.setTipoSanguineo(ts);

        u.salvarInfo();

        Intent y = new Intent(this, TelaColetarDados.class);
        startActivity(y);


    }



}
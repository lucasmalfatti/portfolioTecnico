package com.example.ihelp;

import static android.Manifest.permission_group.PHONE;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BotaoEmergencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_botao_emergencia);
        getSupportActionBar().hide();

    }
    public void print(String p) {
        Toast.makeText(this, p, Toast.LENGTH_LONG).show();
    }

    public void ligacao(View arg0) {
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:0377778888"));

        if (ContextCompat.checkSelfPermission(BotaoEmergencia.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(BotaoEmergencia.this, new String[]{Manifest.permission.CALL_PHONE},1);
        }
        else
        {
            startActivity(callIntent);
        }


    }
}
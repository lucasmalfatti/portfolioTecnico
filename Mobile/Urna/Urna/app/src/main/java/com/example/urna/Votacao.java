package com.example.urna;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class Votacao extends AppCompatActivity {
    ArrayList<Candidato> candidatos = new ArrayList<>();
    EditText num1, num2;
    String numCandidato;

    int n = 0;
    Candidato matue = new Candidato(
            "Matuê", "30", "Presidente",  0);
    Candidato felipe = new Candidato(
            "Felipe Neto", "13", "Presidente", 0);
    Candidato jean = new Candidato(
            "Jean Wyllys", "24", "Presidente", 0);
    Candidato mamae = new Candidato(
            "Mamâe Falei", "11", "Presidente", 0);
    Candidato gabriel = new Candidato(
            "Gabriel Monteiro", "10", "Presidente", 0);
    Candidato nando = new Candidato(
            "Nando Moura", "69", "Presidente", 0);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votacao);
        getSupportActionBar().hide();
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        candidatos.add(matue);
        candidatos.add(felipe);
        candidatos.add(jean);
        candidatos.add(mamae);
        candidatos.add(gabriel);
        candidatos.add(nando);
    }

    public void escolhaCandidato(View v){
        String n1 = ""+num1.getText();
        String n2 = ""+num2.getText();
        numCandidato = n1+n2;
        String msg = "Voto anulado";
        for(Candidato c : candidatos){
            if(numCandidato.equals(c.getNumero())){
                c.setContVotos(c.getContVotos()+1);
                msg = "Voto efetuado com sucesso!";
            }
        }
        Toast.makeText(this,msg , Toast.LENGTH_SHORT).show();
    }

    public void botao1(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "1");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "1");
        }
    }
    public void botao2(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "2");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "2");
        }
    }
    public void botao3(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "3");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "3");
        }
    }
    public void botao4(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "4");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "4");
        }
    }
    public void botao5(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "5");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "5");
        }
    }
    public void botao6(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "6");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "6");
        }
    }
    public void botao7(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "7");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "7");
        }
    }
    public void botao8(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "8");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "8");
        }
    }
    public void botao9(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "9");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "9");
        }
    }

    public void botao0(View v) {
        if (n % 2 == 0) {
            String digito = num1.getText() + "";
            num1.setText(digito + "0");
            n++;
        } else {
            String digito = num2.getText() + "";
            num2.setText(digito + "0");
        }
    }
    public void corrigir(View v){
        String digito = "";
        num1.setText(digito);
        num2.setText(digito);
        n = 0;
    }
}
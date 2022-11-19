package com.example.urna;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.lang.ref.Reference;

public class Usuario {
    String cpf;
    int aux;

    public Usuario(String cpf, int aux) {
        this.cpf = cpf;
        this.aux = aux;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAux() { return aux; }

    public void setAux(int aux) { this.aux = aux; }

    public void salvarUsuario(){
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Usuarios").child(cpf).setValue(this);
    }
}
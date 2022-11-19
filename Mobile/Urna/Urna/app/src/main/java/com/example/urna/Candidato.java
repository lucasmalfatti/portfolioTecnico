package com.example.urna;

public class Candidato {
    String nome, numero, cargo;
    int contVotos;

    public Candidato(String nome, String numero, String cargo, int contVotos) {
        this.nome = nome;
        this.numero = numero;
        this.cargo = cargo;
        this.contVotos = contVotos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getContVotos() {
        return contVotos;
    }

    public void setContVotos(int contVotos) {
        this.contVotos = contVotos;
    }
}

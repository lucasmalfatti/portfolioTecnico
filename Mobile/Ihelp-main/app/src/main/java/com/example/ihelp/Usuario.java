package com.example.ihelp;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Usuario {
    String dataNasc, nomeCompleto, sexo, cpf, nTelefone, doencasQuePossui, alergias, medicamentosQueFazUso, tipoSanguineo,numero1, numero2, numero3, nomeNumero1, nomeNumero2, nomeNumero3, planoContratado;
    String login;
    String nome;
    int senha;


    public Usuario(String login, String nome, int senha) {
        this.login = login;
        this.nome = nome;
        this.senha = senha;

    }

    public Usuario() {

    }

    public Usuario(String doencasQuePossui, String alergias, String medicamentosQueFazUso, String tipoSanguineo) {
        this.doencasQuePossui = doencasQuePossui;
        this.alergias = alergias;
        this.medicamentosQueFazUso = medicamentosQueFazUso;
        this.tipoSanguineo = tipoSanguineo;
    }


    public Usuario(String dataNasc, String nomeCompleto, String sexo, String cpf, String nTelefone) {
        this.dataNasc = dataNasc;
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.cpf = cpf;
        this.nTelefone = nTelefone;
    }

    public Usuario(String numero1, String numero2, String numero3,String nomeNumero1,String nomeNumero2,String nomeNumero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
        this.nomeNumero1 = nomeNumero1;
        this.nomeNumero2 = nomeNumero2;
        this.nomeNumero3 = nomeNumero3;
    }


    public Usuario(String planoContratado) {
        this.planoContratado= planoContratado;
    }

    public String getPlanoContratado() {
        return planoContratado;
    }

    public void setPlanoContratado(String planoContratado) {
        this.planoContratado = planoContratado;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void salvar() {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Usuarios").child(login.replace(".", "")).setValue(this);
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getnTelefone() {
        return nTelefone;
    }

    public void setnTelefone(String nTelefone) {
        this.nTelefone = nTelefone;
    }

    public String getDoencasQuePossui() {
        return doencasQuePossui;
    }

    public void setDoencasQuePossui(String doencasQuePossui) {this.doencasQuePossui = doencasQuePossui;}

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getMedicamentosQueFazUso() {
        return medicamentosQueFazUso;
    }

    public void setMedicamentosQueFazUso(String medicamentosQueFazUso) {this.medicamentosQueFazUso = medicamentosQueFazUso;}

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    public String getNumero3() {
        return numero3;
    }

    public void setNumero3(String numero3) {
        this.numero3 = numero3;
    }

    public String getNomeNumero1() {
        return nomeNumero1;
    }

    public void setNomeNumero1(String nomeNumero1) {
        this.nomeNumero1 = nomeNumero1;
    }

    public String getNomeNumero2() {
        return nomeNumero2;
    }

    public void setNomeNumero2(String nomeNumero2) {
        this.nomeNumero2 = nomeNumero2;
    }

    public String getNomeNumero3() {
        return nomeNumero3;
    }

    public void setNomeNumero3(String nomeNumero3) {
        this.nomeNumero3 = nomeNumero3;
    }



    public void salvarInfo() {
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference();
        reference.child("Usuarios").child(login.replace(".", "")).setValue(this);
        TelaInfoPessoais.logado = this;
        TelaInfoSaude.logado = this;
        TelaContatosEmergencia.logado = this;
        TelaDeVendas.logado = this;
    }


}
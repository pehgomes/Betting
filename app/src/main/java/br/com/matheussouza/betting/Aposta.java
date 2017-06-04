package br.com.matheussouza.betting;

import com.orm.SugarRecord;


public class Aposta extends SugarRecord<ApostaEntity> {

    String nome;
    int numeroAposta;

    public Aposta() {

    }

    public Aposta(String nome, int numeroAposta) {
        this.nome = nome;
        this.numeroAposta = numeroAposta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroAposta() {
        return numeroAposta;
    }

    public void setNumeroAposta(int numeroAposta) {
        this.numeroAposta = numeroAposta;
    }
}

package br.com.matheussouza.betting;

import com.orm.SugarRecord;

/**
 * Created by matheus on 03/06/17.
 */

public class ApostaEntity extends SugarRecord<ApostaEntity> {

    String nome;
    int numeroAposta;

    public ApostaEntity() {

    }

    public ApostaEntity(String nome, int numeroAposta) {
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
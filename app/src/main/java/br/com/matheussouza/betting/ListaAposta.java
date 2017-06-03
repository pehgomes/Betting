package br.com.matheussouza.betting;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

public class ListaAposta extends AppCompatActivity {

    private ListView listaAposta;
    private List<ApostaEntity> apostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aposta);

        apostas = ApostaEntity.listAll(ApostaEntity.class);
        listaAposta = (ListView) findViewById(R.id.lista_aposta);

        ApostaAdapter adapter = new ApostaAdapter(getApplicationContext(), apostas);
        listaAposta.setAdapter(adapter);


    }
}

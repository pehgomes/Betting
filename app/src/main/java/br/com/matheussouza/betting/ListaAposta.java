package br.com.matheussouza.betting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ListaAposta extends AppCompatActivity {

    private ListView listaAposta;
    private List<ApostaEntity> apostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aposta);

        Intent intent = getIntent();
        String parametro = String.valueOf(intent.getStringExtra("tela"));

        if (parametro.equals("1")) {
            apostas = ApostaEntity.listAll(ApostaEntity.class);
        } else {
            apostas = ApostaEntity.find(ApostaEntity.class, "numero_aposta = ?", String.valueOf(intent.getIntExtra("numeroSorteado", 100)));
        }
        listaAposta = (ListView) findViewById(R.id.lista_aposta);

        ApostaAdapter adapter = new ApostaAdapter(getApplicationContext(), apostas);
        listaAposta.setAdapter(adapter);
        Toast.makeText(getApplicationContext(), parametro, Toast.LENGTH_SHORT).show();
    }
}

package br.com.pedro.apostando;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.List;

public class ListaAposta extends AppCompatActivity {

    private ListView listaAposta;
    private List<Aposta> apostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_aposta);

        Intent intent = getIntent();

        if (intent != null) {
            parametro = String.valueOf(intent.getStringExtra("tela"));
        }

        if (parametro.equals("1")) {
            apostas = ApostaEntity.listAll(ApostaEntity.class);
        } else {
            numeroSorteado = intent.getIntExtra("numeroSorteado", 100);
            apostas = ApostaEntity.find(ApostaEntity.class, "numero_aposta = ?", String.valueOf(numeroSorteado));
            Toast.makeText(getApplicationContext(), "O número sorteado foi " + String.valueOf(numeroSorteado), Toast.LENGTH_SHORT).show();
        }
        listaAposta = (ListView) findViewById(R.id.lista_aposta);

        ApostaAdapter adapter = new ApostaAdapter(getApplicationContext(), apostas);
        listaAposta.setAdapter(adapter);
}

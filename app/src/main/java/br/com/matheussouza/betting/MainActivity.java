package br.com.matheussouza.betting;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity {

    private FloatingActionMenu menuOpcoes;
    private FloatingActionButton fazerAposta;
    private FloatingActionButton consultarAposta;
    private FloatingActionButton realizarSorteio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuOpcoes = (FloatingActionMenu) findViewById(R.id.menu_opcao);
        fazerAposta = (FloatingActionButton) findViewById(R.id.fazer_aposta);
        consultarAposta = (FloatingActionButton) findViewById(R.id.consultar_aposta);
        realizarSorteio = (FloatingActionButton) findViewById(R.id.realizar_sorteio);

        fazerAposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Aposta.class);
                startActivity(intent);
            }
        });
    }
}

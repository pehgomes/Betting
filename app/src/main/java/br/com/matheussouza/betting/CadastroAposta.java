package br.com.matheussouza.betting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroAposta extends AppCompatActivity {

    private EditText nome;
    private EditText numeroAposta;
    private Button cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_aposta);

        nome = (EditText) findViewById(R.id.edt_nome);
        numeroAposta = (EditText) findViewById(R.id.edt_aposta);
        cadastrar = (Button) findViewById(R.id.bt_cadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (nome.getText().toString().equals("") || numeroAposta.getText().toString().equals("")) {
                Toast.makeText(getApplicationContext(), "Todos os campos são obrigatórios", Toast.LENGTH_SHORT).show();
            } else {
                ApostaEntity apostaParaCadastrar = new ApostaEntity(nome.getText().toString(), Integer.valueOf(numeroAposta.getText().toString()));
                apostaParaCadastrar.save();
                finish();
            }
            }
        });
    }
}

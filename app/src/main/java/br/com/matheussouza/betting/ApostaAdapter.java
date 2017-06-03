package br.com.matheussouza.betting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by matheus on 03/06/17.
 */

public class ApostaAdapter extends BaseAdapter {

    private List<ApostaEntity> apostas;
    private Context context;

    public ApostaAdapter(Context context, List<ApostaEntity> apostas) {
        this.context = context;
        this.apostas = apostas;
    }

    @Override
    public int getCount() {
        return apostas.size();
    }

    @Override
    public Object getItem(int position) {
        return apostas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.lista_aposta, null);
        } else {
            view = convertView;
        }

        ApostaEntity apostaEntity = apostas.get(position);
        apostaEntity.setNome(apostas.get(position).getNome());
        apostaEntity.setNumeroAposta(apostas.get(position).getNumeroAposta());

        TextView nome = (TextView) view.findViewById(R.id.nome_apostador);
        //TextView numero = (TextView) view.findViewById(R.id.numero_aposta);

        nome.setText(apostaEntity.getNome());
        //numero.setText(apostaEntity.getNumeroAposta());

        return view;
    }
}

package com.example.aqpgo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListAdapter extends ArrayAdapter<Restaraunte> {
    private List<Restaraunte> mListres;
    private Context mContext;
    private int resourceLayout;
    public ListAdapter(@NonNull Context context, int resource, List<Restaraunte> objects) {
        super(context, resource, objects);
        this.mListres=objects;
        this.mContext=context;
        this.resourceLayout=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view=convertView;
        if (view==null){
            view= LayoutInflater.from(mContext).inflate(resourceLayout,null);
        }
        Restaraunte restaraunte= mListres.get(position);

        ImageView imgRes= view.findViewById(R.id.img_res);
        imgRes.setImageResource(restaraunte.getImgRes());


        TextView nomRes= view.findViewById(R.id.nom_res);
        nomRes.setText(restaraunte.getNombreRes());

        ImageView caliRes= view.findViewById(R.id.res_cal);
        caliRes.setImageResource(restaraunte.getCalificacion());

        TextView estado= view.findViewById(R.id.estado_res);
        estado.setText(restaraunte.getEstado());

        TextView tipoRes= view.findViewById(R.id.tipo_res);
        tipoRes.setText(restaraunte.getTipoRes());

        TextView pedidomin= view.findViewById(R.id.pedido_min);
        pedidomin.setText(restaraunte.getPedMin());

        TextView entrega= view.findViewById(R.id.timpo_entrega);
        entrega.setText(restaraunte.getTimeEntre());

        return view;
    }
}

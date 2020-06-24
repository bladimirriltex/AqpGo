package com.example.aqpgo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListRestauranteActivity extends Activity implements AdapterView.OnItemClickListener{
    private ListView mListView;
    private List<Restaraunte> mListares=new ArrayList<>();
    ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_restaurante);

        mListView=findViewById(R.id.lis_restaurante);
        mListView.setOnItemClickListener(this);
        mListares.add(new Restaraunte(R.drawable.bembos,"Bembos",R.drawable.calificacion,
                "Abierto","hamburguesas","Pedido minimo: S/.10","Entrega de: 20 a 40 min"));
        mListares.add(new Restaraunte(R.drawable.caprichos,"Caprichos",R.drawable.calificacion,
                "Abierto","Pasteleria","Pedido minimo: S/.30","Entrega de: 40 a 50 min"));
        mListares.add(new Restaraunte(R.drawable.chinawok,"China Wok",R.drawable.calificacion,
                "Abierto","Comida China","Pedido minimo: S/.20","Entrega de: 30 a 40 min"));
        mListares.add(new Restaraunte(R.drawable.kfc,"KFC",R.drawable.calificacion,
                "Abierto","Comida Rapida","Pedido minimo: S/.10","Entrega de: 20 a 45 min"));
        mListares.add(new Restaraunte(R.drawable.norkys,"Norky's",R.drawable.calificacion,
                "Abierto","Polleria","pedido minimo: S/.40","Entrega de: 20 a 50 min"));
        mListares.add(new Restaraunte(R.drawable.ottogrill,"Otto Grill",R.drawable.calificacion,
                "Abierto","Parrillas","pedido minimo: S/.40","Entrega de: 35 a 55 min"));
        mListares.add(new Restaraunte(R.drawable.papajhons,"Papa Johns",R.drawable.calificacion,
                "Abierto","Pizzas","pedido minimo: S/.30","Entrega de: 40 a 50 min"));
        mListares.add(new Restaraunte(R.drawable.pizzahut,"Pizza Hut",R.drawable.calificacion,
                "Abierto","Pizza","pedido minimo: S/.25","Entrega de: 25 a 45 min"));
        mListares.add(new Restaraunte(R.drawable.popeyes,"Popeyes",R.drawable.calificacion,
                "Abierto","Comida Rapida","pedido minimo: S/.30","Entrega de: 20 a 35 min"));
        mAdapter= new ListAdapter(this,R.layout.row_restaurante,mListares);
        mListView.setAdapter(mAdapter);


        LinearLayout ubicacion= (LinearLayout)findViewById(R.id.ubicacion);
        OnClickListener UbicacionMap= new OnClickListener(this,MapsActivity.class);
        ubicacion.setOnClickListener(UbicacionMap);

        LinearLayout tiendas= (LinearLayout)findViewById(R.id.tiendas);
        OnClickListener tienda= new OnClickListener(this,ListRestauranteActivity.class);
        tiendas.setOnClickListener(tienda);

        LinearLayout inicio= (LinearLayout)findViewById(R.id.inico);
        OnClickListener home= new OnClickListener(this,ListRestauranteActivity.class);
        tiendas.setOnClickListener(home);

        LinearLayout contac= (LinearLayout)findViewById(R.id.contactanos);
        OnClickListener contacta= new OnClickListener(this,ListRestauranteActivity.class);
        tiendas.setOnClickListener(contacta);




    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent= new Intent(this,MapsActivity.class);
        //falta implementar
        startActivity(intent);
    }
}
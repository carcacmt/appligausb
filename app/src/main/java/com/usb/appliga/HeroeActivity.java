package com.usb.appliga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.usb.appliga.modelo.Adaptador;
import com.usb.appliga.modelo.Heroe;
import com.usb.appliga.modelo.Liga;

import java.util.List;

public class HeroeActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroe);
        listView=findViewById(R.id.listview);
        Liga liga=new Liga();
        List<Heroe> heroes=liga.ligaJusticia();
        Adaptador adaptador=new Adaptador(heroes,this);
        listView.setAdapter(adaptador);
        View header = LayoutInflater.from(this).inflate(R.layout.header,null);
        View footer = LayoutInflater.from(this).inflate(R.layout.footer,null);
        listView.addHeaderView(header);
        listView.addFooterView(footer);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position!=0 & position!=(heroes.size()-1)) {
                    position=position-1;
                    // Toast.makeText(getBaseContext(), String.valueOf(position), Toast.LENGTH_LONG).show();
                    Heroe heroe=heroes.get(position);
                    Bundle bundle=new Bundle();
                    bundle.putSerializable("heroe",heroe);
                    Intent intent=new Intent(getBaseContext(),DetalleActivity.class);
                    intent.putExtra("bundle",bundle);
                    startActivity(intent);
                }
            }
        });


    }
}
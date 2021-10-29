package com.usb.appliga.modelo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.usb.appliga.R;

import java.util.List;

public class Adaptador extends BaseAdapter {

     public List<Heroe> heroes;
     public Context context;
     private LayoutInflater layoutInflater;

     public Adaptador(List<Heroe> heroes,Context context){
         this.heroes=heroes;
         this.context=context;
     }

    @Override
    public int getCount() {
        return heroes.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView heroetext;
        ImageView heroeimage;
        layoutInflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.heroe_item,parent,false);
        heroeimage=view.findViewById(R.id.heroeimage);
        heroetext=view.findViewById(R.id.herotext);
        heroetext.setText(heroes.get(position).getNombre());
        heroeimage.setImageResource(heroes.get(position).getImagen());
        return view;

    }
}

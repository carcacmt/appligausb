package com.usb.appliga.modelo;

import com.usb.appliga.R;

import java.util.ArrayList;
import java.util.List;

public class Liga {

    public List<Heroe> ligaJusticia(){
        List<Heroe> liga=new ArrayList<Heroe>();
        liga.add(new Heroe("superman", R.drawable.superman));
        liga.add(new Heroe("batman", R.drawable.batman));
        liga.add(new Heroe("Mujer Maravilla", R.drawable.wonder));
        liga.add(new Heroe("Aquaman", R.drawable.aquaman));
        liga.add(new Heroe("Cyborg", R.drawable.cyborg));
        liga.add(new Heroe("flash", R.drawable.flash));
        return liga;
    }
}

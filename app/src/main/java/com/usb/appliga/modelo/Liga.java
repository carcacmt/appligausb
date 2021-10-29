package com.usb.appliga.modelo;

import com.usb.appliga.R;

import java.util.ArrayList;
import java.util.List;

public class Liga {

    public List<Heroe> ligaJusticia(){
        List<Heroe> liga=new ArrayList<Heroe>();
        liga.add(new Heroe("superman", R.drawable.superman,
                "Volar, Rayos Laser, Super Fuerza"));
        liga.add(new Heroe("batman", R.drawable.batman,"Multimillonario"));
        liga.add(new Heroe("Mujer Maravilla", R.drawable.wonder,"Super Fuerza y " +
                "Velocidad"));
        liga.add(new Heroe("Aquaman", R.drawable.aquaman,"Control de los Mares"));
        liga.add(new Heroe("Cyborg", R.drawable.cyborg,"Control de Equipos Electronico"));
        liga.add(new Heroe("flash", R.drawable.flash,"SuperVelocidad"));
        return liga;
    }
}

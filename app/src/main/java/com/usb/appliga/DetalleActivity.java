package com.usb.appliga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.usb.appliga.modelo.Heroe;

public class DetalleActivity extends AppCompatActivity {
    private TextView heroetextdet;
    private ImageView imageviewdet;
    private TextView podertext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        heroetextdet=findViewById(R.id.herotextdet);
        imageviewdet=findViewById(R.id.heroeimagedet);
        podertext=findViewById(R.id.podertext);
        Bundle bundle=getIntent().getBundleExtra("bundle");
        Heroe heroe=(Heroe)bundle.getSerializable("heroe");
        heroetextdet.setText(heroe.getNombre());
        imageviewdet.setImageResource(heroe.getImagen());
        podertext.setText(heroe.getPoder());

    }
}
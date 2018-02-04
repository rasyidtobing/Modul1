package com.example.android.mrasyidridhotobing_1202150064_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText makanan, porsi; //untuk deklarasi objek
    Intent intent;
    String restaurant, menu;
    int portion;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //method ketika dijalankan saat activity dibuat
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makanan = (EditText) findViewById(R.id.makanan); //masukan makanan
        porsi = (EditText) findViewById(R.id.porsi); //masukan porsi
        intent = new Intent (this,SecondActivity.class); //untuk pindah aktivitas
    }

    public void onEatbus(View view) {
        menu = makanan.getText().toString();
        restaurant = "Eatbus";
        portion = Integer.parseInt(porsi.getText().toString());
        int total = 50000 * Integer.parseInt(porsi.getText().toString()); //jumlah porsi dikali harga restoran kemudian dipaksa menjadi integer
        Log.d("TOTAL HARGA", "Rp."+total); //menampilkan sesuatu di Logcat android studio
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }

    public void onAbnormal(View view) {
        menu = makanan.getText().toString();
        restaurant = "Abnormal";
        portion = Integer.parseInt(porsi.getText().toString());
        int total = 30000 * Integer.parseInt(porsi.getText().toString()); //jumlah porsi dikali harga restoran kemudian dipaksa menjadi integer
        Log.d("TOTAL HARGA", "Rp."+total); //menampilkan sesuatu di Logcat android studio
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }
}

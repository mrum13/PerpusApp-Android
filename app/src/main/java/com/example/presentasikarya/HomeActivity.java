package com.example.presentasikarya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    Intent intent;
    CardView cvbuku,cvcal,cvprofil,cvreport;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    cvbuku = findViewById(R.id.buku);
    cvcal = findViewById(R.id.cal);
    cvprofil = findViewById(R.id.profil);
    cvreport = findViewById(R.id.report);

    cvbuku.setOnClickListener(this);
    cvprofil.setOnClickListener(this);
    cvcal.setOnClickListener(this);
    cvreport.setOnClickListener(this);
}

    @Override
    public void onClick(View view) {
        switch(view.getId()){

            case R.id.buku: /** Start a new Activity MyCards.java */
                intent = new Intent(this, icon1_activity.class);
                this.startActivity(intent);
                break;

            case R.id.profil: /** AlerDialog when click on Exit */
                intent = new Intent(this, profil_activity.class);
                this.startActivity(intent);
                break;

            case R.id.cal: /** Start a new Activity MyCards.java */
//                intent = new Intent(this, icon1_activity.class);
//                this.startActivity(intent);
                break;

            case R.id.report: /** AlerDialog when click on Exit */
//                intent = new Intent(this, profil_activity.class);
//                this.startActivity(intent);
                break;
            default:break;
        }
    }
}
package com.example.presentasikarya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private String judulDetail,deskripsiDetail;
    private int gambarDetail;
    private ImageView img;
    private TextView tvJudul,tvDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        img = findViewById(R.id.gambar_detail);
        tvJudul = findViewById(R.id.tv_judul_detail);
        tvDesc = findViewById(R.id.tv_deskripsi_detail);

        getIncomingIntent();
    }

    private void getIncomingIntent(){
        if(getIntent().hasExtra("judul") && getIntent().hasExtra("gambar") && getIntent().hasExtra("deskripsi")) {
            judulDetail = getIntent().getStringExtra("judul");
            deskripsiDetail = getIntent().getStringExtra("deskripsi");
            gambarDetail = getIntent().getIntExtra("gambar", 1);

            tvJudul.setText(judulDetail);
            tvDesc.setText(deskripsiDetail);
            Glide.with(this)
                    .asBitmap()
                    .load(gambarDetail)
                    .into(img);
        }
    }
}
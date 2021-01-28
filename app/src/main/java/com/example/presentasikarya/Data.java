package com.example.presentasikarya;

import java.util.ArrayList;

public class Data {
    private static String[] nama_wadah = {
            "JUDUL",
            "JUDUL",
            "JUDUL"
    };
    private static int[] gambar_wadah = {
            R.drawable.book,
            R.drawable.star,
            R.drawable.profile
    };
    private static String[] deskripsi = {
            "DESKRIPSI",
            "DESKRIPSI",
            "DESKRIPSI"
    };

    public static ArrayList<Model> getListData() {
        ArrayList<Model> list = new ArrayList<>();
        for (int position = 0; position < nama_wadah.length; position++) {
            Model list_data = new Model();
            list_data.setJudul(nama_wadah[position]);
            list_data.setGambar(gambar_wadah[position]);
            list_data.setDeskripsi(deskripsi[position]);
            list.add(list_data);
        }
        return list;
    }

}


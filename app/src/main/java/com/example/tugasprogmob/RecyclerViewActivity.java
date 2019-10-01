package com.example.tugasprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.tugasprogmob.Adapter.MahasiswaAdapter;
import com.example.tugasprogmob.Model.Mahasiswa;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter mahasiswaAdapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        recyclerView = findViewById(R.id.rvMahasiswa);
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mahasiswaAdapter);
    }

    private void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_background,"Didimus Candra","72170139","Laki-Laki","Basket","Pebisnis","Selalu Bersyukur"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_background,"Beni Mulia","72170177","Laki-Laki","Basket","Programmer","Nikmati Hasil"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_background,"Aryawan Ravato","72170115","Laki-Laki","Bermain Barongsay dan Liong","Programmer","Teruslah berproses, meski itu berat"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_background,"Monica Carista","72170187","Perempuan","Balapan","Programmer","Berproses Itu Indah"));
        mahasiswaArrayList.add(new Mahasiswa(R.drawable.ic_launcher_background,"Eva Kristina","72170102","Perempuan","Makan","Pengusaha Kios","Nikmati Proses"));
    }
}

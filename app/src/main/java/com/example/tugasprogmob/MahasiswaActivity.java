package com.example.tugasprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MahasiswaActivity extends AppCompatActivity implements MahasiswaFragment.SendMessage, Mahasiswa2Fragment.SendMessage1 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahasiswa);

                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                MahasiswaFragment mahasiswaFragment = MahasiswaFragment.newInstance("72170139","Didimus Candra");
                ft.replace(R.id.frameMhs, mahasiswaFragment);
                ft.commit();
    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Mahasiswa2Fragment mahasiswa2Fragment = Mahasiswa2Fragment.newInstance(Message, "Para Progmobers");
        ft.replace(R.id.frameMhs, mahasiswa2Fragment);
        ft.commit();
    }

    public void SendData2(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        MahasiswaFragment mahasiswaFragment = MahasiswaFragment.newInstance(Message, "Para Progmobers");
        ft.replace(R.id.frameMhs, mahasiswaFragment);
        ft.commit();
    }
}

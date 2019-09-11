package com.example.tugasprogmob;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmenActivity extends AppCompatActivity implements ProteinFragment.SendMessage {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmen);

        Button btnPress = findViewById(R.id.buttonTesFragmen);


        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ProteinFragment proteinFragment = ProteinFragment.newInstance("Hai","Para Progmobers");
                ft.replace(R.id.frameMain, proteinFragment);// replace frameMain ke proteinFragment
                ft.commit();
            }
        });
    }

    @Override
    public void SendData(String Message) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Protein2Fragment protein2Fragment = Protein2Fragment.newInstance(Message, "Para Progmobers");
        ft.replace(R.id.frameMain, protein2Fragment);
        ft.commit();
    }
}

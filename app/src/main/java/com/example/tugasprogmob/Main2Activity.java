package com.example.tugasprogmob;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button resetButton = (Button)findViewById(R.id.btnReset);
        Button setButton = (Button)findViewById(R.id.btnSetting);
        Button loginButton = (Button)findViewById(R.id.btnLogin);

        SharedPreferences prefs = Main2Activity.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
        String statusLogin = prefs.getString("isLogin",null);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs =
                        Main2Activity.this.getSharedPreferences("prefs_file",MODE_PRIVATE);
                String statusLogin = prefs.getString("isLogin",null); SharedPreferences.Editor edit = prefs.edit();
                Button btnLogin = (Button)findViewById(R.id.btnLogin); if (statusLogin != null){
                    edit.putString("isLogin",null);
                    btnLogin.setText("Login"); }else{
                    edit.putString("isLogin","Admin");
                    btnLogin.setText("Logout"); }
                edit.commit();
            }
        });
        if (statusLogin != null){ loginButton.setText("Logout");
        }else{ loginButton.setText("Login");
        }


        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);

                builder.setMessage("Apakah anda yakin untuk mereset nilai protein?").setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Main2Activity.this, "Tidak Jadi Reset", Toast.LENGTH_SHORT).show();
                    }
                }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(Main2Activity.this, "Melakukan Reset !!", Toast.LENGTH_SHORT).show();
                    }
                });

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });


    }
}

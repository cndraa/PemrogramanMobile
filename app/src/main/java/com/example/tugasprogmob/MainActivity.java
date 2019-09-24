package com.example.tugasprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*@Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc","test");
        super.onSaveInstanceState(outState);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.mainActivityTextView);
        final EditText myEditText = findViewById(R.id.editText1);
        Button myBtn = findViewById(R.id.btnKelolaMhs);
        Button btnHelp = findViewById(R.id.helpButton);
        Button btnLayout = findViewById(R.id.buttonLayout);
        Button btnApp = findViewById(R.id.buttonAppTracker);
        Button btnFragmen = findViewById(R.id.buttonFragmen);
        Button btnMahasiswa = findViewById(R.id.btnMahasiswa);
        Button btnLst = findViewById(R.id.btnList);

        textView.setText(R.string.Test_untuk_Update_View);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Progmob A", myEditText.getText().toString());
            }
        });

        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HelpActivity.class); //intent untuk berpindah Helpactivity
                startActivity(intent);
            }
        });

        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class); //intent untuk berpindah Main2activity
                startActivity(intent);
            }
        });

        btnApp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, Main3Activity.class); //intent untuk berpindah Main3activity
                startActivity(intent);
            }
        });

        btnFragmen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, FragmenActivity.class); //intent untuk berpindah Main3activity
                startActivity(intent);
            }
        });

        if(savedInstanceState != null){
            Log.d("Progmob A",savedInstanceState.getString("abc"));
        }

        btnMahasiswa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MahasiswaActivity.class);
                startActivity(intent);
            }
        });

        btnLst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(intent);
            }
        });

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListMhsActivity.class);
                startActivity(intent);
            }
        });


        btnHelp.setOnClickListener(helpButtonListener);


    }

    private View.OnClickListener helpButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);

            Bundle b = new Bundle();

            EditText myEditText = (EditText)findViewById(R.id.editText1);
            b.putString("helpString",myEditText.getText().toString());
            intent.putExtras(b);

            startActivity(intent);
        }
    };
}

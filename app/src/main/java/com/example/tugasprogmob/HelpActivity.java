package com.example.tugasprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView txtView = findViewById(R.id.textView2);
        txtView.setText("Candra Ganteng");

        Bundle b = getIntent().getExtras();
        String tmpString = b.getString("helpString");

        txtView.setText(tmpString);
    }
}

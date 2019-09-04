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
        Button myBtn = findViewById(R.id.button1);
        Button btnHelp = findViewById(R.id.helpButton);


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
                Intent intent = new Intent(MainActivity.this, HelpActivity.class); //intent untuk berpindah activity
                startActivity(intent);
            }
        });

        btnHelp.setOnClickListener(helpButtonListener);

        if(savedInstanceState != null){
            Log.d("Progmob A",savedInstanceState.getString("abc"));
        }
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

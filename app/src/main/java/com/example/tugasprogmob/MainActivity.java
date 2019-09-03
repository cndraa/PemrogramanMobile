package com.example.tugasprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.mainActivityTextView);
        textView.setText(R.string.Test_untuk_Update_View);

        Button myBtn = (Button) findViewById(R.id.button1);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText myEditText = (EditText) findViewById(R.id.editText1);
                Log.d("TugasProgmob",myEditText.getText().toString());
            }
        });

        myBtn.setOnClickListener(myBtnClickListener);
    }

    private View.OnClickListener myBtnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            EditText myEditText = (EditText)findViewById(R.id.editText1);
            Log.d("TugasProgmob",myEditText.getText().toString());
        }
    };



}

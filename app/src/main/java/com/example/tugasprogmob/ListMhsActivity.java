package com.example.tugasprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class ListMhsActivity extends AppCompatActivity {

    String[] items={"Riyan Mozes Sahetapy", "Brian Eldrin Sombuk", "Elias Aru F. Langer", "Aditya Halimawan", "Immanuel Harold Maga", "Eben Haezer Gultom", "Yosua Erick Gunawan",
            "Nana Eka Wulandari", "Eva Kristina", "Jonathan Prajna Marga Parama", "Emma Norren Cahya Putri", "Michael Gerardi Adji", "Cynthia Kumalasari", "Nikolaus Aryawan Ravato Wijaya", "Daniel Surya Nugraha",
            "Lionrico Sanjay Exauvida Jeipy", "Jonathan Alvin Ananto", "Monica Carista", "Didimus Candra Gased", "Valeriana Tanesha Indra S",
            "Ivan Bernov", "Friska F. Nainggolan", "Grace Hutabarat", "Beni Mulia Tabarus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mhs);
        Button btnTmbh = findViewById(R.id.btnTambah2);
        Button btnEdit = findViewById(R.id.btnUpdate2);

        ListView lstView = (ListView) findViewById(R.id.lsMhs);


        lstView.setAdapter(new ArrayAdapter<String>(ListMhsActivity.this, android.R.layout.simple_list_item_1, items));

        lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListMhsActivity.this, "Anda Memilih = " + items[i], Toast.LENGTH_LONG).show();
            }
        });

        btnTmbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMhsActivity.this, AddMhsActivity.class); //intent untuk berpindah Main3activity
                startActivity(intent);
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ListMhsActivity.this, UpdateMhsActivity.class); //intent untuk berpindah Main3activity
                startActivity(intent);
            }
        });

    }
}

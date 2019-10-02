package com.example.tugasprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        lstView.setAdapter(adapter);
        registerForContextMenu(lstView);

        //lstView.setAdapter(new ArrayAdapter<String>(ListMhsActivity.this, android.R.layout.simple_list_item_1, items));

        /*lstView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListMhsActivity.this, "Anda Memilih = " + items[i], Toast.LENGTH_LONG).show();
            }
        });*/

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

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Silahkan Pilih");
        menu.add(0,v.getId(),0,"Edit");//groupId, itemID, Order, Tittle
        menu.add(0,v.getId(),0,"Hapus");
    }

    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Edit"){
            Intent intent = new Intent(ListMhsActivity.this, UpdateMhsActivity.class); //intent untuk berpindah Main3activity
            startActivity(intent);
        }else if (item.getTitle()=="Hapus"){
            Toast.makeText(getApplicationContext(),"Hapus Item", Toast.LENGTH_SHORT).show();
        }else {
            return false;
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu1,menu);
        return true;
    }

    //isi dari menu titik tiga
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.item1){
            Intent intent = new Intent(ListMhsActivity.this, MahasiswaFragment.class); //intent untuk berpindah Main3activity
            startActivity(intent);
        }if(item.getItemId() == R.id.item2){
            Intent intent = new Intent(ListMhsActivity.this, ListActivity.class); //intent untuk berpindah Main3activity
            startActivity(intent);
        }if(item.getItemId() == R.id.item3){
            Intent intent = new Intent(ListMhsActivity.this, MainActivity.class); //intent untuk berpindah Main3activity
            startActivity(intent);
        }if(item.getItemId() == R.id.item4){
            Toast.makeText(getApplicationContext(), "Ini Menu Keempat yang diklik", Toast.LENGTH_SHORT).show();
        }
        return true;
    }
}

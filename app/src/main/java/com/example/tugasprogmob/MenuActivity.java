package com.example.tugasprogmob;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //context menu
        String ContMenu[] = {"Ayam","Unta","Mentok","Rusa","Badak"};
        ListView lv = (ListView)findViewById(R.id.LstView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ContMenu);
        lv.setAdapter(adapter);
        registerForContextMenu(lv);
    }

    //context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu,v,menuInfo);
        menu.setHeaderTitle("Silahkan Pilih");
        menu.add(0,v.getId(),0,"Simpan");//groupId, itemID, Order, Tittle
        menu.add(0,v.getId(),0,"Tidak");
    }

    public boolean onContextItemSelected(MenuItem item){
        if(item.getTitle()=="Simpan"){
            Toast.makeText(getApplicationContext(),"Pura-puranya Item Disimpan Ke DB", Toast.LENGTH_SHORT).show();
        }else if (item.getTitle()=="Tidak"){
            Toast.makeText(getApplicationContext(),"Tidak Disimpan ke DB", Toast.LENGTH_SHORT).show();
        }else {
            return false;
        }
        return true;
    }

    //Nampilin icon titik tiga diatas kanan
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
            Toast.makeText(getApplicationContext(), "Ini Menu Pertama yang diklik", Toast.LENGTH_SHORT).show();
        }if(item.getItemId() == R.id.item2){
            Toast.makeText(getApplicationContext(), "Ini Menu Kedua yang diklik", Toast.LENGTH_SHORT).show();
        }if(item.getItemId() == R.id.item3){
            Toast.makeText(getApplicationContext(), "Ini Menu Ketiga yang diklik", Toast.LENGTH_SHORT).show();
        }if(item.getItemId() == R.id.item4){
            Toast.makeText(getApplicationContext(), "Ini Menu Keempat yang diklik", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

    //CONTEXT MENU




}

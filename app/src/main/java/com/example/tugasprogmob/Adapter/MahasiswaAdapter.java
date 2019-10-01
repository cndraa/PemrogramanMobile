package com.example.tugasprogmob.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tugasprogmob.Model.Mahasiswa;
import com.example.tugasprogmob.R;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder> {

    Context context;
    private ArrayList<Mahasiswa> dataList;
    public MahasiswaAdapter(ArrayList<Mahasiswa> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_mhs, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.icon.setImageResource(dataList.get(position).getFoto());
        holder.txtNama.setText(dataList.get(position).getNama());
        holder.txtNim.setText(dataList.get(position).getNim());
        holder.txtGender.setText(dataList.get(position).getGender());
        holder.txtHobi.setText(dataList.get(position).getHobi());
        holder.txtCita.setText(dataList.get(position).getCita());
        holder.txtMoto.setText(dataList.get(position).getMoto());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtNim, txtGender, txtHobi, txtCita, txtMoto;
        private ImageView icon;

        public ViewHolder(View view){
            super(view);//Super --> akan mengambil
            icon = view.findViewById(R.id.imgPerson);
            txtNama = view.findViewById(R.id.txtNamaMhs);
            txtNim = view.findViewById(R.id.txtNimMhs);
            txtGender = view.findViewById(R.id.txtGender);
            txtHobi = view.findViewById(R.id.txtHobi);
            txtCita = view.findViewById(R.id.txtCita);
            txtMoto = view.findViewById(R.id.txtMoto);

        }
    }
}

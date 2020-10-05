package com.example.helloprogmob.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.helloprogmob.Pertemuan2.Model.Mahasiswa;
import com.example.helloprogmob.R;

import java.util.ArrayList;
import java.util.List;

public class MahasiswaRecycleAdapter extends RecyclerView.Adapter<MahasiswaRecycleAdapter.ViewHolder>{
    private Context context;
    private List<Mahasiswa> mahasiswaList;

    public MahasiswaRecycleAdapter(Context context) {
        this.context = context;
        mahasiswaList = new ArrayList<>();
    }

    public List<Mahasiswa> getMahasiswaList() {
        return mahasiswaList;
    }

    public void setMahasiswaList(List<Mahasiswa> mahasiswaList) {
        this.mahasiswaList = mahasiswaList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_list_cardview,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaRecycleAdapter.ViewHolder holder, int position) {
            Mahasiswa m = mahasiswaList.get(position);

            holder.tvNama.setText(m.getNama());
            holder.tvNim.setText(m.getNim());
            holder.tvNoTelp.setText(m.getNotelp());

    }

    @Override
    public int getItemCount() {
        return mahasiswaList.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNama, tvNim, tvNoTelp;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNama);
            tvNim = itemView.findViewById(R.id.tvNim);
            tvNoTelp = itemView.findViewById(R.id.tvNoTelp);
        }
    }
}
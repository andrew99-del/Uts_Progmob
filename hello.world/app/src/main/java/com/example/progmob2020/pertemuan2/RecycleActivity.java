package com.example.progmob2020.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.progmob2020.Adapter.MhsRecyclerAdapter;
import com.example.progmob2020.Model.Mahasiswa;
import com.example.progmob2020.R;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class RecycleActivity extends AppCompatActivity {

    private Object MhsRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        RecyclerView rv = (RecyclerView)findViewById(R.id.LvLatihan);
        MhsRecyclerAdapter mahasiswaRecyclerAdapter;

        //data dummy
        List<Mahasiswa> mahasiswaList = new ArrayList<mahasiswa>();

        //gaenerate data mhs
        Mahasiswa m1 = new Mahasiswa("Ndree","72170093","081238123145");
        Mahasiswa m2 = new Mahasiswa("ojo","72170094","081238123123");
        Mahasiswa m3 = new Mahasiswa("riki","72170095","081238123668");
        Mahasiswa m4 = new Mahasiswa("chong","72170096","081238123344");
        Mahasiswa m5 = new Mahasiswa("gilbert","72170097","081238128899");

        mahasiswaList.add(m1);
        mahasiswaList.add(m2);
        mahasiswaList.add(m3);
        mahasiswaList.add(m4);
        mahasiswaList.add(m5);

    MhsRecyclerAdapter = new MhsRecyclerAdapter(RecycleActivity.this);
    MhsRecyclerAdapter.setmahasiswaList(mahasiswaList);

    rv.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
    rv.setAdapter((RecyclerView.Adapter) MhsRecyclerAdapter);
    }
}
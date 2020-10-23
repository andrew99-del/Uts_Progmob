package com.example.progmob2020.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.progmob2020.MainActivity;
import com.example.progmob2020.pertemuan2.ListActivity;
import com.example.progmob2020.R;



public class ListActivity extends AppCompatActivity {

    String[] items={"lorem", "ipsum", "dolor", "sit", "amet",
            "consectetuer", "adipiscing", "elit", "morbi", "vel",
            "ligula", "vitae", "arcu", "aliquet", "mollis",
            "etiam", "vel", "erat", "placerat", "ante",
            "porttitor", "sodales", "pellentesque", "augue", "purus"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView lv = (ListView)findViewById(R.id.LvLatihan);
        Spinner sp = (Spinner) findViewById(R.id.spinnerLatihan);

        lv.setAdapter(new ArrayAdapter<String>(ListActivity.this,android.R.layout.simple_list_item_1));
        ArrayAdapter<String> aa=new ArrayAdapter<String>(ListActivity.this,
                android.R.layout.simple_spinner_item,
                items);
sp.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"selamat anda memilih " + items[position],
                        Toast.LENGTH_SHORT).show();
            }

    });

        sp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(ListActivity.this, "anda memilih : " + items[i], Toast.LENGTH_LONG);
            }
            @Override
            public void onNothingSelected (AdapterView<?> adapterView) {
                Toast.makeText(ListActivity.this, "anda tidak memilih : ",Toast.LENGTH_LONG);
            }
        });
}
}

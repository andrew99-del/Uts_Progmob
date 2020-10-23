package com.example.progmob2020;

import androidx.appcompat.app.AppCompatActivity;
import com.example.progmob2020.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.progmob2020.pertemuan2.ListActivity;
import com.example.progmob2020.MainActivity;
import com.example.progmob2020.pertemuan2.RecycleActivity;

public class MainActivity extends AppCompatActivity {

    private Object Intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //variable
        final TextView textView = (TextView)findViewById(R.id.mainActivityTextView);
        Button myBtn = (Button)findViewById(R.id.btn1);
        final EditText myEdittext = (EditText)findViewById(R.id.editText1);
        Button btnHelp = (Button)findViewById(R.id.btnHelp);

        //pertemuan2
        Button btnList = (Button)findViewById(R.id.buttonLatihanView);
        Button btnRecycler = (Button)findViewById(R.id.buttonRecyclerView);
        Button btnCard = (Button)findViewById(R.id.buttonCardView);

        //action
        textView.setText("Hallo temannya andrew azio");
        myBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                textView.setText(myEdittext.getText().toString());
            }
        });
        Intent intent;
        btnHelp.setOnClickListener((View) {
                Intent,intent = new Intent(MainActivity.this, HelpActivity.class);
        Bundle b = new Bundle();

        b.putString("helpString", myEdittext.getText().toString());
        intent.putExtras(b);

        startActivity(intent);
        )};


        btnList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ListActivity.class);
                startActivity(intent);

            }

        });

        btnRecycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, RecycleActivity.class);
        startActivity(intent);
            }
        });

    }
}

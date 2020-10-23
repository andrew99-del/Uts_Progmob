package com.example.progmob2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

        final TextView txtView = (TextView)findViewById(R.id.mainActivityTextView);
        Button mybtn = (Button)findViewById(R.id.btn1);
        final EditText myEditText = (EditText)findViewById(R.id.editText1);
        Button btnHelp = (Button)findViewById(R.id.btnHelp);

        txtView.setText(R.string.Text_untuk_update_view);
        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Log.d("KLIK SAYAAAA", myEditText.getText().toString());
            txtView.setText(myEditText.getText().toString());
            }
        });
        btnHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,HelpActivity.class);
                Bundle b = new Bundle();

                b.putString("help_string",myEditText.getText().toString());
                intent.putExtras(b);

                startActivity(intent);
            }
        });
    }
}

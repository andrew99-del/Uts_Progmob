package com.example.progmob2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView txthelp = (TextView)findViewById(R.id.TextViewHelp);

        Bundle b = getIntent().getExtras();
        String textHelp = b.getString("help_string");
        txthelp.setText(textHelp);
    }
}
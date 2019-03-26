package com.example.rasel.stringpassingthroughintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void submet_message(View view) {

        EditText textV = findViewById(R.id.edit_text_message);
        String messsageText = textV.getText().toString();


        Intent intent = new Intent(this,MessageActivity.class);
        intent.putExtra("New Message",messsageText);
        startActivity(intent);

    }
}

package com.example.utsptikb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editAlas, editTinggi;
    Button buttonHitung;
    TextView luas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlas        = (EditText) findViewById(R.id.editAlas);
        editTinggi      = (EditText) findViewById(R.id.editTinggi);
        buttonHitung    = (Button) findViewById(R.id.buttonHitung);
        luas            = (TextView) findViewById(R.id.luas);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int alas = Integer.parseInt(editAlas.getText().toString());
                int tinggi = Integer.parseInt(editTinggi.getText().toString());

                int hasil = alas * tinggi / 2;

                luas.setText(String.valueOf(hasil));

            }
        });
    }


}
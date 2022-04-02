package com.example.utsptikb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editDiameter;
    Button buttonHitung;
    TextView luas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editDiameter    = (EditText) findViewById(R.id.editDiameter);
        buttonHitung    = (Button) findViewById(R.id.buttonHitung);
        luas            = (TextView) findViewById(R.id.luas);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double diameter = Double.valueOf(editDiameter.getText().toString());
                double r        = diameter / 2;
                double pi       = 3.14;

                double hasil = pi * r * r;

                luas.setText(String.valueOf(hasil));

            }
        });
    }


}
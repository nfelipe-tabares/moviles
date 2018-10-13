package com.example.norbeytabares.cinemagic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static final String MainActivity2 = ImageButton;
    Button volver;
    public Bundle args = new Bundle();

    private EditText urlname1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        volver = (Button) findViewById(R.id.volver);


        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver = new Intent(MainActivity.this, fragment_1);
                startActivity(volver);

            }});
        }
    }






    public void btn1(View view) {
        setContentView(R.layout.fragment_fragment_1);
    }


    /*public void btn2(View view) {
        setContentView(R.layout.fragment_fragment_2);
    }

    public void btn3(View view) {
        setContentView(R.layout.fragment_fragment_3);
    }

    public void btn4(View view) {
        setContentView(R.layout.fragment_fragment_4);
    }*/


}
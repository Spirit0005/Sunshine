package com.example.hk_th.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView weather_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weather_list = findViewById(R.id.wather_list);
        int temp= 16;
                for(int i = 0;i<10; i++) {

            weather_list.append(""+ temp + " Celcius\n \n \n");

            temp +=2;
        }
    }
}

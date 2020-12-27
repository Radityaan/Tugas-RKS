package com.example.rks;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnFragment1,btnFragment2,btnFragment3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment1=findViewById(R.id.btn_fragment1);
        btnFragment2=findViewById(R.id.btn_fragment2);
        btnFragment3=findViewById(R.id.btn_fragment3);

        btnFragment1.setOnClickListener(new View.OnClickListener() {

                @Override
                        public void onClick(View v){
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft=fm.beginTransaction();
                    ft.replace(R.id.container, new HomeFragment());
                    ft.commit();
            }
        });

        btnFragment2.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick (View v){
                        FragmentManager fm = getSupportFragmentManager();
                        FragmentTransaction ft=fm.beginTransaction();
                        ft.replace(R.id.container, new ChatFragment());
                        ft.commit();
                    }
                });

        btnFragment3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick (View v){
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.container, new SetFragment());
                ft.commit();
            }
        });

        }
}
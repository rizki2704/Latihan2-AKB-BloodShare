package com.rizki.latihan2_bloodshare_if1_10118025;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void pindah_register (View view){
        Intent intent = new Intent(MainActivity.this, Register.class);
        startActivity(intent);
    }
}

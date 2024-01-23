package com.example.qlsanbong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    ImageButton btnDatSan;
    ImageButton btnSanCuaToi;
    ImageButton btnTaiKhoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDatSan = (ImageButton) findViewById(R.id.imageButton7);
        btnSanCuaToi = (ImageButton) findViewById(R.id.imageButton8);
        btnTaiKhoan = (ImageButton) findViewById(R.id.imageButton9);
        btnTaiKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TaiKhoan.class);
                startActivity(intent);
            }
        });
        btnSanCuaToi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SanCuaToi.class);
                startActivity(intent);
            }
        });
        btnDatSan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DatSan.class);
                startActivity(intent);
            }
        });
    }
}
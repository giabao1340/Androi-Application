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
    ImageButton btnThongBao;
    ImageButton btnDanhGia;
    ImageButton btnVeChungToi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDatSan =  findViewById(R.id.imageButton7);
        btnSanCuaToi =  findViewById(R.id.imageButton8);
        btnTaiKhoan =  findViewById(R.id.imageButton9);
        btnThongBao = findViewById(R.id.imageButton3);
        btnDanhGia = findViewById(R.id.imageButton4);
        btnVeChungToi = findViewById(R.id.imageButton6);
        btnVeChungToi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), VeChungToi.class));
            }
        });
        btnDanhGia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), DanhGia.class));
            }
        });
        btnThongBao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ThongBao.class));
            }
        });
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
package com.example.qlsanbong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;
import androidx.appcompat.widget.Toolbar;

import java.util.List;

public class DatSan extends AppCompatActivity {
    ImageButton btnBack;
    ImageButton btnChonNgay;
    private Spinner spinner1;
    private Spinner spinner2;
    private List<San> Sans;
    private List<KhungGio> khungGio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dat_san);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Đặt sân");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        btnChonNgay = (ImageButton) findViewById(R.id.imageButtonChonNgay);
        btnChonNgay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChonNgay.class);
                startActivity(intent);
            }
        });
        // Data:
        this.Sans = DSSan.getSan();
        this.spinner1 = (Spinner) this.findViewById(R.id.spinnerSan);
        // Adapter"
        CustomAdapterSan adapter = new CustomAdapterSan(DatSan.this,
                R.layout.spinner_item_san,
                R.id.textViewSan,
                this.Sans);
        this.spinner1.setAdapter(adapter);


        this.khungGio = DSKhungGio.getKhungGio();
        this.spinner2 = (Spinner) this.findViewById(R.id.spinnerGio);
        CustomAdapterGio adapter2 = new CustomAdapterGio(DatSan.this,
                R.layout.spinner_item_gio,
                R.id.textViewGio,
                this.khungGio);
        this.spinner2.setAdapter(adapter2);
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
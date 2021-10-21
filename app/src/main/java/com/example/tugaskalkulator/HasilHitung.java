package com.example.tugaskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HasilHitung extends AppCompatActivity {

    private TextView HasilHitung;
    private Button Ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil_hitung);
        HasilHitung= findViewById(R.id.textHasil);
        Ok= findViewById(R.id.Ok);

        String hasil = getIntent().getStringExtra("hasil");
        HasilHitung.setText(hasil);
    }

    public void kembali(View view) {
        onBackPressed();
    }
}
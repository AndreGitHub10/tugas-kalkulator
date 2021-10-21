package com.example.tugaskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    TextView hasil;
    Button button;
    Spinner spinner;
    String operasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=(EditText) findViewById(R.id.input1);
        input2=(EditText) findViewById(R.id.input2);
        hasil=(TextView) findViewById(R.id.hasil);
        button=(Button) findViewById(R.id.btnHitung);
        spinner=(Spinner) findViewById(R.id.spinner);

//        button.setOnClickListener((view) -> {
//            operasi=spinner.getSelectedItem().toString();
//            hasil.setText(hitung());
//        });
    }
    public String hitung(){
        double num1, num2, count;
        num1=Double.valueOf(input1.getText().toString().trim());
        num2=Double.valueOf(input2.getText().toString().trim());
        switch (operasi) {
            case "Tambah":
                count=num1+num2;
                break;
            case "Kurang":
                count=num1-num2;
                break;
            case "Kali":
                count=num1*num2;
                break;
            case "Bagi":
                count=num1/num2;
                break;
            default:
                count=0;
                break;
        }
        return count+"";
    }

    public void Hitung(View view) {
        operasi=spinner.getSelectedItem().toString();
        Intent pindahHitung = new Intent(MainActivity.this, HasilHitung.class);
        pindahHitung.putExtra("hasil", hitung());
        startActivity(pindahHitung);
    }
}
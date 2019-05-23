package com.igoy.belajarcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnPlus, btnMinus, btnMultiply, btnDivide;
    EditText et1, et2;
    TextView tvHasil;
    Double angka1, angka2, hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        tvHasil = findViewById(R.id.tvHasil);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);


        tambah();
        kurang();
        kali();
        bagi();

    }

    private void tambah() {
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Double.parseDouble(et1.getText().toString());
                angka2 = Double.parseDouble(et2.getText().toString());
                hasil = angka1 + angka2;
                tvHasil.setText(String.valueOf(hasil));
            }
        });
    }

    private void kurang() {
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Double.parseDouble(et1.getText().toString());
                angka2 = Double.parseDouble(et2.getText().toString());
                hasil = angka1 - angka2;
                tvHasil.setText(String.valueOf(hasil));
            }
        });
    }

    private void kali() {
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Double.parseDouble(et1.getText().toString());
                angka2 = Double.parseDouble(et2.getText().toString());
                hasil = angka1 * angka2;
                tvHasil.setText(String.valueOf(hasil));
            }
        });
    }

    private void bagi() {
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka1 = Double.parseDouble(et1.getText().toString());
                angka2 = Double.parseDouble(et2.getText().toString());
                hasil = angka1 / angka2;
                tvHasil.setText(String.valueOf(hasil));
            }
        });
    }

}

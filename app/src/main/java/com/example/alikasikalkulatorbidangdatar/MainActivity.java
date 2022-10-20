package com.example.alikasikalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alikasikalkulatorbidangdatar.R;

public class MainActivity extends AppCompatActivity {


    EditText edtpanjang, edtlebar;
    TextView txt1, txt2, txtKeliling, txtLuas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtpanjang = findViewById(R.id.edtpanjang);
        edtlebar = findViewById(R.id.edtlebar);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txtKeliling = findViewById(R.id.txtKeliling);
        txtLuas = findViewById(R.id.txtLuas);
    }

    public void htgPersegi(View v) {
        String nilai1 = edtpanjang.getText().toString();
        String nilai2 = edtlebar.getText().toString();

        if(nilai1.isEmpty()){
            edtpanjang.setError("Data tidak boleh kosong");
            edtpanjang.requestFocus();
        }else if(nilai2.isEmpty()){
            edtlebar.setError("Data tidak boleh kosong");
            edtlebar.requestFocus();
        }else{
            Double panjang = Double.parseDouble(nilai1);
            Double lebar = Double.parseDouble(nilai2);

            Double luas = panjang * lebar;
            Double keliling = (2*panjang) + (2*lebar);

            txt1.setText("Panjang : " +nilai1);
            txt2.setText("Lebar : " +nilai2);
            txtKeliling.setText("Luas = " +String.valueOf(luas));
            txtLuas.setText("Keliling = " +String.valueOf(keliling));
        }
    }
    public void htgSegitiga(View v) {
        String nilai1 = edtpanjang.getText().toString();
        String nilai2 = edtlebar.getText().toString();

        if(nilai1.isEmpty()){
            edtpanjang.setError("Data tidak boleh kosong");
            edtpanjang.requestFocus();
        }else if(nilai2.isEmpty()){
            edtlebar.setError("Data tidak boleh kosong");
            edtlebar.requestFocus();
        }else{
            Double alas = Double.parseDouble(nilai1);
            Double tinggi = Double.parseDouble(nilai2);
            Double sisi = Math.sqrt(((alas*alas)+(tinggi*tinggi)));


            Double luas = 0.5 * alas * tinggi;
            Double keliling = 3 * sisi;

            txt1.setText("Alas : " +nilai1);
            txt2.setText("Tinggi : " +nilai2);
            txtKeliling.setText("Luas = " +String.valueOf(luas));
            txtLuas.setText("Keliling = " +String.valueOf(keliling));
        }
    }
    public void htgLingkaran(View v) {
        String nilai1 = edtpanjang.getText().toString();

        if(nilai1.isEmpty()){
            edtpanjang.setError("Data tidak boleh kosong");
            edtpanjang.requestFocus();
        }else{
            Double diameter = Double.parseDouble(nilai1);

            Double luas = Math.PI * Math.pow(diameter/2, 2);
            Double keliling = 2 * Math.PI * (diameter/2);

            edtlebar.setText("");
            txt1.setText("Diameter : " +nilai1);
            txt2.setText("");
            txtKeliling.setText("Luas = " +String.valueOf(luas));
            txtLuas.setText("Keliling = " +String.valueOf(keliling));
        }
    }
}
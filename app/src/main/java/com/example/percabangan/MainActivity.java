package com.example.percabangan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    protected Spinner agama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Form Registrasi");

        agama = findViewById(R.id.agama);
        List<String> item = new ArrayList<String>();
        item.add("----- Pilih Agama -----");
        item.add("Islam");
        item.add("Kristen");
        item.add("katolik");
        item.add("Hindu");
        item.add("Budha");
        item.add("Konghucu");

        ArrayAdapter<String> data = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,item);
        data.setDropDownViewResource(android.R.layout.simple_spinner_item);
        agama.setAdapter(data);
    }

    public void bukaDetail(View view){
        // Ambil widget
        EditText nama = findViewById(R.id.nama);
        EditText no_hp = findViewById(R.id.no_hp);
        RadioButton laki_laki = findViewById(R.id.radioButton2);
        RadioButton wanita = findViewById(R.id.radioButton3);
        agama = findViewById(R.id.agama);
        CheckBox status1 = findViewById(R.id.sudah_bekerja);
        CheckBox status2 = findViewById(R.id.blm_bekerja);

        // ambil nilai dari widget
        String nama_value = nama.getText().toString();
        String no_hp_value = no_hp.getText().toString();
        String agama_value = agama.getSelectedItem().toString();
        String jenis_kelamin_value = laki_laki.isChecked() ? laki_laki.getText().toString() : wanita.getText().toString();
        String status_value  = status1.isChecked() ? status1.getText().toString() : status2.getText().toString();

        // mengirimkan data
        Intent intent = new Intent(this, Detail_user.class);
        intent.putExtra("nama",nama_value);
        intent.putExtra("no_hp",no_hp_value);
        intent.putExtra("agama",agama_value);
        intent.putExtra("jenis_kelamin",jenis_kelamin_value);
        intent.putExtra("status",status_value);
        startActivity(intent);

    }







}
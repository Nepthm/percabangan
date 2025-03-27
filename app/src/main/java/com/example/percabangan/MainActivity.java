package com.example.percabangan;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
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
    protected Spinner spiner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spiner = findViewById(R.id.spinner);
        List<String> item = new ArrayList<String>();
        item.add("----- Pilih Negara -----");
        item.add("Indonesia");
        item.add("Malaysia");
        item.add("Singapura");

        ArrayAdapter<String> data = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,item);
        data.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spiner.setAdapter(data);
    }

    public void tampil_item(View view){
        Toast.makeText(this, spiner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }





}
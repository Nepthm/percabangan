package com.example.percabangan;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Detail_user extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail_user);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        getSupportActionBar().setTitle("Detail user");

        // Menerima data dari activity sebelumnya
        String nama = getIntent().getStringExtra("nama");
        String no_hp = getIntent().getStringExtra("no_hp");
        String jenis_kelamin = getIntent().getStringExtra("jenis_kelamin");
        String agama = getIntent().getStringExtra("agama");
        String status = getIntent().getStringExtra("status");

        // Menampilkan data ke widget
       TextView set_nama =  findViewById(R.id.nama_value);
       TextView set_no_hp =  findViewById(R.id.no_hp_value);
       TextView set_jenis_kelamin =  findViewById(R.id.jenis_kelamin_value);
       TextView set_agama =  findViewById(R.id.agama_value);
       TextView set_status =  findViewById(R.id.status_value);
       set_nama.setText(nama);
       set_no_hp.setText(no_hp);
       set_jenis_kelamin.setText(jenis_kelamin);
       set_agama.setText(agama);
       set_status.setText(status);
    }
}
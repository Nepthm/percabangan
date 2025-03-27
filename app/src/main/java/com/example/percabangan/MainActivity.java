package com.example.percabangan;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cb(View view){
        CheckBox cb_1 = findViewById(R.id.cb_HOK);
        CheckBox cb_2 = findViewById(R.id.cb_ML);
        String game_terbaik = "";
        if(cb_1.isChecked()){
            game_terbaik = cb_1.getText().toString();
        }
        if(cb_2.isChecked()){
            game_terbaik = cb_2.getText().toString();
        }
        if (cb_1.isChecked() && cb_2.isChecked()){
            game_terbaik = cb_1.getText().toString()+ " dan " + cb_2.getText().toString();
        }

        Toast.makeText(this, game_terbaik  , Toast.LENGTH_SHORT).show();
    }
}
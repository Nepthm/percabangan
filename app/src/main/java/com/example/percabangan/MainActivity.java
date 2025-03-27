package com.example.percabangan;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
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

    public void rb(View view){
        RadioButton rb_1 = findViewById(R.id.radioButton);
        RadioButton rb_2 = findViewById(R.id.radioButton2);
        if (rb_1.isChecked()){
            Toast.makeText(this, rb_1.getText().toString(), Toast.LENGTH_SHORT).show();
        }else if(rb_2.isChecked()){
            Toast.makeText(this, rb_2.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }


}
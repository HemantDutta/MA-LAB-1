package com.example.ma_lab_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void greeting(View view){
        EditText mEdit = findViewById(R.id.editTextText);
        String data = mEdit.getText().toString();

        Toast.makeText(this, "Hello "+data, Toast.LENGTH_SHORT).show();
    }
}
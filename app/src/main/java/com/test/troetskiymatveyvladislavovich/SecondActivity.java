package com.example.lifecycleapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получение данных из интента
        String fullName = getIntent().getStringExtra("fullName");
        String group = getIntent().getStringExtra("group");
        int age = getIntent().getIntExtra("age", 0);
        int grade = getIntent().getIntExtra("grade", 0);

        // Отображение данных
        TextView textView = findViewById(R.id.text_info);
        textView.setText("ФИО: " + fullName + "\nГруппа: " + group + "\nВозраст: " + age + "\nОценка: " + grade);
    }
}

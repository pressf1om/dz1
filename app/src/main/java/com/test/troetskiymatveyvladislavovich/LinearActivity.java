package com.test.troetskiymatveyvladislavovich;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LinearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_linear);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        MyObject myObject = (MyObject) getIntent().getSerializableExtra("myObject");
        TextView Name = findViewById(R.id.lin_name);
        TextView Group = findViewById(R.id.lin_group);
        TextView Age = findViewById(R.id.lin_age);
        TextView Mark = findViewById(R.id.lin_mark);

        Name.setText(myObject.getName().toString());
        Group.setText(myObject.getGroup().toString());
        Age.setText(Integer.toString(myObject.getAge()));
        Mark.setText(Integer.toString(myObject.getMark()));

        String name = "Имя: " + myObject.getName();
        String group = "Группа: " + myObject.getGroup();
        String age = "Возраст: " + myObject.getAge();
        String mark = "Оценка: " + myObject.getMark();
        Name.setText(name);
        Group.setText(group);
        Age.setText(age);
        Mark.setText(mark);
    }
    public void goBack(View view) {
        onBackPressed();
    }
}
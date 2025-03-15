package com.test.troetskiymatveyvladislavovich;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.TextView;


public class RelativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_relative);

        MyObject myObject = (MyObject) getIntent().getSerializableExtra("myObject");
        if (myObject != null) {
            TextView textViewInfo = findViewById(R.id.textViewInfo);
            String info = "Имя: " + myObject.getName() +
                    "\nГруппа: " + myObject.getGroup() +
                    "\nВозраст: " + myObject.getAge() +
                    "\nОценка: " + myObject.getMark();
            textViewInfo.setText(info);
        }


        MyObject myObject2 = (MyObject) getIntent().getSerializableExtra("myObject");
        if (myObject2 != null) {
            TextView textView = findViewById(R.id.textView);
            String info = "Имя: " + myObject2.getName() +
                    "\nГруппа: " + myObject2.getGroup() +
                    "\nВозраст: " + myObject2.getAge() +
                    "\nОценка: " + myObject2.getMark();
            textView.setText(info);
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void goBack(View view) {
        onBackPressed();
    }
}
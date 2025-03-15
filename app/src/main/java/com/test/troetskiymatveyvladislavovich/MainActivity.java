package com.test.troetskiymatveyvladislavovich;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.util.Log;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void RealativeOn(View view) {
        EditText editName = findViewById(R.id.name);
        EditText editGroup = findViewById(R.id.group);
        EditText editAge = findViewById(R.id.age);
        EditText editMark = findViewById(R.id.mark);

        String name = editName.getText().toString();
        String group = editGroup.getText().toString();
        int age = Integer.parseInt(editAge.getText().toString());
        int mark = Integer.parseInt(editMark.getText().toString());

        MyObject myObject = new MyObject(name, group, age, mark);
        Intent intent = new Intent(this, RelativeActivity.class);
        intent.putExtra("myObject", myObject);
        startActivity(intent);

    }
    public void ConstrationOn(View view) {
        EditText editName = findViewById(R.id.name);
        EditText editGroup = findViewById(R.id.group);
        EditText editAge = findViewById(R.id.age);
        EditText editMark = findViewById(R.id.mark);

        String name = editName.getText().toString();
        String group = editGroup.getText().toString();
        int age = Integer.parseInt(editAge.getText().toString());
        int mark = Integer.parseInt(editMark.getText().toString());

        MyObject myObject = new MyObject(name, group, age, mark);
        Intent intent = new Intent(this, ConstraintActivity.class);
        intent.putExtra("myObject", myObject);
        startActivity(intent);
    }

    public void FrameOn(View view) {
        EditText editName = findViewById(R.id.name);
        EditText editGroup = findViewById(R.id.group);
        EditText editAge = findViewById(R.id.age);
        EditText editMark = findViewById(R.id.mark);

        String name = editName.getText().toString();
        String group = editGroup.getText().toString();
        int age = Integer.parseInt(editAge.getText().toString());
        int mark = Integer.parseInt(editMark.getText().toString());

        MyObject myObject = new MyObject(name, group, age, mark);
        Intent intent = new Intent(this, FrameActivity.class);
        intent.putExtra("myObject", myObject);
        startActivity(intent);
    }

    public void LinearOn(View view) {
        EditText editName = findViewById(R.id.name);
        EditText editGroup = findViewById(R.id.group);
        EditText editAge = findViewById(R.id.age);
        EditText editMark = findViewById(R.id.mark);

        String name = editName.getText().toString();
        String group = editGroup.getText().toString();
        int age = Integer.parseInt(editAge.getText().toString());
        int mark = Integer.parseInt(editMark.getText().toString());

        MyObject myObject = new MyObject(name, group, age, mark);
        Intent intent = new Intent(this, LinearActivity.class);
        intent.putExtra("myObject", myObject);
        startActivity(intent);
    }

}
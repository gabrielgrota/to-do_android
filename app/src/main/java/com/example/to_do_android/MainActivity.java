package com.example.to_do_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView text; // h1 do to-do
    private EditText taskInput; // input
    private Button taskSubmit; // button to add task
    private TextView task; // view the task

    Task t1, t2;

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

        text = findViewById(R.id.text1);
        text.setText("Hello android to-do!");

        taskInput = findViewById(R.id.taskInput);

        taskSubmit = findViewById(R.id.taskSubmit);

        task = findViewById(R.id.task);


        t1 = new Task("Workout");
        t2 = new Task("Wash dishes");

    }

    public void addTask(View view) {
        task.setText(taskInput.getText());
        taskInput.setText("");
    }

}
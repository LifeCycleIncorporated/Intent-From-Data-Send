package com.example.intentfromdatasend;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    private TextView textView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        textView = findViewById(R.id.resultTVId);

        Bundle bundle = getIntent().getExtras();

        if (bundle!=null){
            String value = bundle.getString("key");
            textView.setText(value);
        }

    }
}
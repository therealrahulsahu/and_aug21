package com.rk.rk_aug21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void run(View v)
    {
        tx = findViewById(R.id.et_text);
        String mess = tx.getText().toString();
        Intent in = new Intent(MainActivity.this, new_activity.class);
        in.putExtra("mytext", mess);
        startActivity(in);
    }
}

package com.rk.rk_aug21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class new_activity extends AppCompatActivity {
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_activity);

        tx = findViewById(R.id.tv_display);
        Intent in = getIntent();
        String mess = in.getStringExtra("mytext");
        tx.setText(mess);
    }
}

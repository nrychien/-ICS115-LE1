package com.example.dell.le1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Solve extends AppCompatActivity {

    TextView tv_RA, tv_FG;
    Button btn_Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solve);

        tv_RA = (TextView) findViewById(R.id.ra);
        tv_FG = (TextView) findViewById(R.id.fg);
        btn_Back = (Button) findViewById(R.id.back);
        String msg1 = getIntent().getStringExtra("rgrade");
        String msg2 = getIntent().getStringExtra("fgrade");
        tv_RA.setText(msg1);
        tv_FG.setText(msg2);
    }

    public void backMain (View view) {
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}

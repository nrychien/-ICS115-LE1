package com.example.dell.le1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et_Q1, et_Q2, et_Sw, et_Labexer, et_Major;
    Button btn_Cont;
    double ra;
    String RawGrade;
    String FinalGrade;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Q1= (EditText) findViewById(R.id.q1);
        et_Q2= (EditText) findViewById(R.id.q2);
        et_Sw= (EditText) findViewById(R.id.sw);
        et_Labexer= (EditText) findViewById(R.id.labexer);
        et_Major= (EditText) findViewById(R.id.major);
        btn_Cont = (Button) findViewById(R.id.cont);

        double q1 = Integer.parseInt(et_Q1.getText().toString());
        double q2 = Double.parseDouble(et_Q2.getText().toString());
        double sw = Double.parseDouble(et_Sw.getText().toString());
        double labexer = Double.parseDouble(et_Labexer.getText().toString());
        double major = Double.parseDouble(et_Major.getText().toString());
        ra = (.1 * q1) + (.1 * q2) + (.1 * sw) + (.1 * labexer) + (.1 * major);
        if (ra < 60){
            FinalGrade="F A I L E D";
        }
        else if (ra > 59 && ra < 66){
            FinalGrade="3.0";
        }
        else if (ra > 65 && ra < 71){
            FinalGrade="2.75";
        }
        else if (ra > 70 && ra < 76){
            FinalGrade="2.5";
        }
        else if (ra > 75 && ra < 81){
            FinalGrade="2.25";
        }
        else if (ra > 80 && ra < 86){
            FinalGrade="2.00";
        }
        else if (ra > 85 && ra < 91){
            FinalGrade="1.75";
        }
        else if (ra > 90 && ra < 93){
            FinalGrade="1.5";
        }
        else if (ra > 92 && ra < 95){
            FinalGrade="1.25";
        }
        else if (ra > 96 && ra < 101){
            FinalGrade="1.00";
        }
        RawGrade =  String.valueOf(ra);
    }

    public void compute(View view) {
        Intent intent = new Intent(this,Solve.class);
        intent.putExtra("rgrade",RawGrade);
        intent.putExtra("fgrade", FinalGrade);
        startActivity(intent);
    }

}

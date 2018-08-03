package com.jayanthan.num;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ADD=(Button)findViewById(R.id.btn);
        ADD.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                EditText FNUM=(EditText)findViewById(R.id.fn);
                EditText LNUM=(EditText)findViewById(R.id.ln);
                EditText FULLNUM=(EditText)findViewById(R.id.fulln);
                int ch=Integer.parseInt(FNUM.getText().toString())+Integer.parseInt(LNUM.getText().toString());
                FULLNUM.setText(String.valueOf(ch));
            }
        });
    }
}
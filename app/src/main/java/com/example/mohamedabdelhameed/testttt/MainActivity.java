package com.example.mohamedabdelhameed.testttt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn1;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        et = (EditText) findViewById(R.id.et);

        btn1.setOnClickListener(this);

    }


    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
    */
    @Override
    public void onClick(View v) {
        Intent in = new Intent(this,AnotherActivity.class);
        String s = et.getText().toString();
        in.putExtra("x",s);
        startActivity(in);
    }
}

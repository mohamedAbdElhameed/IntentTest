package com.example.mohamedabdelhameed.testttt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by MohamedAbdElhameed on 12/24/2016.
 */

public class AnotherActivity extends Activity implements View.OnClickListener{
    TextView tv;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Intent in = getIntent();
        String s = in.getExtras().getString("x");
        tv = (TextView) findViewById(R.id.tv);
        tv.setText("welcome " + s);
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        finish(); 
    }
}

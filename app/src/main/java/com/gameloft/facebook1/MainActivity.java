package com.gameloft.facebook1;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_sign_up = (Button) findViewById(R.id.btn_sign_up);
        btn_sign_up.setPaintFlags(btn_sign_up.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        Button btn_forgot = (Button) findViewById(R.id.btn_forgot);
        btn_forgot.setPaintFlags(btn_forgot.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
    }
}

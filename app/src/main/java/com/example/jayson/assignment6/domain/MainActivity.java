package com.example.jayson.assignment6.domain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.appcompat.*;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jayson.assignment6.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btnContinue);
        btn.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent i = new Intent(view.getContext(), SecondActivity.class);
                        MainActivity.this.startActivity(i);
                    }
                }
        );

        Button btnQ = (Button) findViewById(R.id.btnQuit);
        btnQ.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        onDestroy();
                        System.exit(0);
                    }
                }
        );
    }
}

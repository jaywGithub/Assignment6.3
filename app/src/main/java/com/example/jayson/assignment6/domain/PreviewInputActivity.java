package com.example.jayson.assignment6.domain;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jayson.assignment6.R;
import com.example.jayson.assignment6.repository.employeerepository.EmployeeRepository;
import com.example.jayson.assignment6.repository.employeerepository.Impl.EmployeeRepositoryImpl;

public class PreviewInputActivity extends AppCompatActivity {

    Button submitBtn;
    EmployeeRepositoryImpl emp;
    private TextView txtName;
    private TextView txtSurname;
    private TextView txtLicense;

    String eName;
    String eSurname;
    String eLicense;

    DB db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview_input);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        submitBtn = (Button)findViewById(R.id.btnSubmit);
        db = new DB(this);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btn = (Button) findViewById(R.id.btnBack);
        btn.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        Intent i = new Intent(view.getContext(), SecondActivity.class);
                        PreviewInputActivity.this.startActivity(i);
                    }
                }
        );


        txtName = (TextView) findViewById(R.id.txtViewNm);
        txtSurname = (TextView) findViewById(R.id.txtViewSnm);
        txtLicense = (TextView) findViewById(R.id.txtViewLic);


        txtName.setText(getIntent().getExtras().getString("name"));
        txtSurname.setText(getIntent().getExtras().getString("surname"));
        txtLicense.setText(getIntent().getExtras().getString("license"));

        AddEmployee();
    }

    public void AddEmployee()
    {
        assert submitBtn != null;
        submitBtn.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {
                        eName = txtName.getText().toString();
                        eSurname = txtSurname.getText().toString();
                        eLicense = txtLicense.getText().toString();
                        if (eName.matches("") || eSurname.matches("")|| eLicense.matches("")) {
                            Toast.makeText(getApplicationContext(), "Empty values not allowed", Toast.LENGTH_LONG).show();
                        }
                        else {
                            boolean isItemInserted = db.insertEmployee(
                                    txtName.getText().toString(),
                                    txtSurname.getText().toString(),
                                    txtLicense.getText().toString());
                            if(isItemInserted == true)
                            {
                                Toast.makeText(PreviewInputActivity.this, "Employee Inserted Successfully", Toast.LENGTH_LONG).show();
                                Intent i = new Intent(getApplicationContext(), DisplayActivity.class);
                                startActivity(i);
                            }
                            else
                                Toast.makeText(PreviewInputActivity.this, "Employee Not Inserted", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );
    }
}

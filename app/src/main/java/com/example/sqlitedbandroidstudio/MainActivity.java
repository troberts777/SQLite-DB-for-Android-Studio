package com.example.sqlitedbandroidstudio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // references to buttons and other controls on the layout
    Button btn_add, btn_viewAll;
    EditText et_name, et_email, et_pass;
    Switch sw_active_user;
    ListView lv_customerList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    btn_add = findViewById(R.id.btn_add);
    btn_viewAll = findViewById(R.id.btn_viewAll);
    et_name = findViewById(R.id.et_name);
    et_email = findViewById(R.id.et_email);
    et_pass = findViewById(R.id.et_pass);
    sw_active_user = findViewById(R.id.sw_active_user);
    lv_customerList = findViewById(R.id.lv_customerList);

    // button listener
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Add Button", Toast.LENGTH_SHORT).show();
            }
        });

        btn_viewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "View All Button", Toast.LENGTH_SHORT).show();
            }
        });




    }





}
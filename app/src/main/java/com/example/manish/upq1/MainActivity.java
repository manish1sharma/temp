package com.example.manish.upq1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText mUsername, mEmail, mDescription;
    private Button mNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNext = (Button) findViewById(R.id.btn_submit);
        mUsername = (EditText) findViewById(R.id.et_username);
        mEmail = (EditText) findViewById(R.id.et_email);
        mDescription = (EditText) findViewById(R.id.et_description);


        mNext.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String userName = mUsername.getText().toString();
                String userEmail = mEmail.getText().toString();
                String userDescription = mDescription.getText().toString();

                Context context = MainActivity.this;
                Class destinationActivity = DetailsActivity.class;
                Intent startChildActivityIntent = new Intent(context, destinationActivity);

                startChildActivityIntent.putExtra("USERNAME", userName);
                startChildActivityIntent.putExtra("EMAIL",userEmail);
                startChildActivityIntent.putExtra("DESCRIPTION",userDescription);
                startActivity(startChildActivityIntent);
            }
        });

    }
}

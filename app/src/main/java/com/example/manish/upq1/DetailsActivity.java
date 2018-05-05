package com.example.manish.upq1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView showUsername, showEmail, showDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        showUsername = (TextView) findViewById(R.id.tv_username);
        showEmail = (TextView) findViewById(R.id.tv_email);
        showDescription = (TextView) findViewById(R.id.tv_description);
        Intent nextButton = getIntent();

        if (nextButton.hasExtra("USERNAME"))
            showUsername.setText(nextButton.getStringExtra("USERNAME"));

        if (nextButton.hasExtra("EMAIL"))
            showEmail.setText(nextButton.getStringExtra("EMAIL"));

        if (nextButton.hasExtra("DESCRIPTION"))
            showDescription.setText(nextButton.getStringExtra("DESCRIPTION"));

    }
}

package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView name = findViewById(R.id.name);
        TextView birthday = findViewById(R.id.birthday);
        TextView country = findViewById(R.id.country);

        name.setText("Jessica");
        birthday.setText("1st January 1995");
        country.setText("South Africa");

        ImageView profilePicture = findViewById(R.id.profile_picture);
        profilePicture.setImageResource(R.drawable.alex_lambley_201846_unsplash);
    }
}

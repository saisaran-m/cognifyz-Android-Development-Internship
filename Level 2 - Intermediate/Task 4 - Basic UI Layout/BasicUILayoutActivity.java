package com.cognifyz.internship.task4;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;

public class BasicUILayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_ui_layout);

        EditText etUsername = findViewById(R.id.etUsername);
        Button btnProfile = findViewById(R.id.btnProfile);
        Button btnSettings = findViewById(R.id.btnSettings);

        btnProfile.setOnClickListener(v -> {
            String username = etUsername.getText().toString().trim();
            if (username.isEmpty()) {
                etUsername.setError("Please enter your name");
                return;
            }
            Intent intent = new Intent(this, ProfileActivity.class);
            intent.putExtra("USERNAME", username);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

        btnSettings.setOnClickListener(v -> {
            startActivity(new Intent(this, SettingsActivity.class));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }
}

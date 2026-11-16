package com.cognifyz.internship.task4;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        String username = getIntent().getStringExtra("USERNAME");
        if (username == null) username = "User";

        TextView tvProfileName = findViewById(R.id.tvProfileName);
        TextView tvProfileEmail = findViewById(R.id.tvProfileEmail);
        TextView tvProfileBio = findViewById(R.id.tvProfileBio);

        tvProfileName.setText(username);
        tvProfileEmail.setText(username.toLowerCase().replace(" ", ".") + "@cognifyz.com");
        tvProfileBio.setText("Android Development Intern at Cognifyz Technologies. Passionate about building innovative mobile applications.");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

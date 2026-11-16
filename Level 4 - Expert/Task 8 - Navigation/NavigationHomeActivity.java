package com.cognifyz.internship.task8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;

public class NavigationHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_home);

        Button btnGoDetail = findViewById(R.id.btnGoDetail);
        Button btnGoAbout = findViewById(R.id.btnGoAbout);

        btnGoDetail.setOnClickListener(v -> {
            Intent intent = new Intent(this, NavigationDetailActivity.class);
            intent.putExtra("TITLE", "Navigation Demo");
            intent.putExtra("MESSAGE", "This screen was opened with a slide-in animation and data was passed via Intent extras.");
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });

        btnGoAbout.setOnClickListener(v -> {
            startActivity(new Intent(this, NavigationAboutActivity.class));
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}

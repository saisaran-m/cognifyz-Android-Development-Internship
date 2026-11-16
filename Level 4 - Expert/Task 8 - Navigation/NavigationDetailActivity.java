package com.cognifyz.internship.task8;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;

public class NavigationDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_detail);

        TextView tvDetailTitle = findViewById(R.id.tvDetailTitle);
        TextView tvDetailMessage = findViewById(R.id.tvDetailMessage);
        Button btnBack = findViewById(R.id.btnDetailBack);

        String title = getIntent().getStringExtra("TITLE");
        String message = getIntent().getStringExtra("MESSAGE");

        if (title != null) tvDetailTitle.setText(title);
        if (message != null) tvDetailMessage.setText(message);

        btnBack.setOnClickListener(v -> {
            finish();
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

package com.cognifyz.internship.task1;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;
import com.cognifyz.internship.TaskMenuActivity;

public class HelloWorldActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        TextView tvWelcome = findViewById(R.id.tvWelcome);
        TextView tvSubtitle = findViewById(R.id.tvSubtitle);
        Button btnExplore = findViewById(R.id.btnExplore);

        // Animate welcome text
        Animation fadeIn = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        tvWelcome.startAnimation(fadeIn);

        new Handler().postDelayed(() -> {
            tvSubtitle.setVisibility(android.view.View.VISIBLE);
            tvSubtitle.startAnimation(fadeIn);
        }, 500);

        new Handler().postDelayed(() -> {
            btnExplore.setVisibility(android.view.View.VISIBLE);
            btnExplore.startAnimation(fadeIn);
        }, 1000);

        btnExplore.setOnClickListener(v -> {
            startActivity(new Intent(HelloWorldActivity.this, TaskMenuActivity.class));
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }
}

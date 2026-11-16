package com.cognifyz.internship.task2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;

public class ButtonInteractionActivity extends AppCompatActivity {

    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_interaction);

        Button btnClick = findViewById(R.id.btnClick);
        Button btnLongClick = findViewById(R.id.btnLongClick);
        Button btnDouble = findViewById(R.id.btnDouble);
        TextView tvCounter = findViewById(R.id.tvCounter);
        TextView tvMessage = findViewById(R.id.tvMessage);

        btnClick.setOnClickListener(v -> {
            clickCount++;
            tvCounter.setText("Click Count: " + clickCount);
            Toast.makeText(this, "Button clicked! Count: " + clickCount, Toast.LENGTH_SHORT).show();
            tvMessage.setText("You clicked the button!");
            tvMessage.setVisibility(View.VISIBLE);
        });

        btnLongClick.setOnLongClickListener(v -> {
            Toast.makeText(this, "Long press detected! Counter reset.", Toast.LENGTH_LONG).show();
            clickCount = 0;
            tvCounter.setText("Click Count: 0");
            tvMessage.setText("Counter has been reset!");
            tvMessage.setVisibility(View.VISIBLE);
            return true;
        });

        btnDouble.setOnClickListener(v -> {
            Toast.makeText(this, "🎉 Great job! You're learning Android!", Toast.LENGTH_SHORT).show();
            tvMessage.setText("You're doing amazing! Keep exploring!");
            tvMessage.setVisibility(View.VISIBLE);
        });
    }
}

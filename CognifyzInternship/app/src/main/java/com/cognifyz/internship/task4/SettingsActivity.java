package com.cognifyz.internship.task4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Switch switchNotifications = findViewById(R.id.switchNotifications);
        Switch switchDarkMode = findViewById(R.id.switchDarkMode);
        Switch switchSound = findViewById(R.id.switchSound);
        Button btnBack = findViewById(R.id.btnSettingsBack);

        if (switchNotifications != null) {
            switchNotifications.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, "Notifications " + (isChecked ? "enabled" : "disabled"), Toast.LENGTH_SHORT).show()
            );
        }

        if (switchDarkMode != null) {
            switchDarkMode.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, "Dark Mode " + (isChecked ? "enabled" : "disabled"), Toast.LENGTH_SHORT).show()
            );
        }

        if (switchSound != null) {
            switchSound.setOnCheckedChangeListener((buttonView, isChecked) ->
                Toast.makeText(this, "Sound " + (isChecked ? "enabled" : "disabled"), Toast.LENGTH_SHORT).show()
            );
        }

        if (btnBack != null) {
            btnBack.setOnClickListener(v -> {
                finish();
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            });
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
}

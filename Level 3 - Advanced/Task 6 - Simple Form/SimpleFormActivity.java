package com.cognifyz.internship.task6;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;

public class SimpleFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_form);

        EditText etName = findViewById(R.id.etFormName);
        EditText etEmail = findViewById(R.id.etFormEmail);
        EditText etPhone = findViewById(R.id.etFormPhone);
        RadioGroup rgGender = findViewById(R.id.rgGender);
        Spinner spinnerDomain = findViewById(R.id.spinnerDomain);
        Button btnSubmit = findViewById(R.id.btnFormSubmit);
        Button btnClear = findViewById(R.id.btnFormClear);
        TextView tvResult = findViewById(R.id.tvFormResult);

        String[] domains = {"Select Domain", "Android Development", "Data Science", "Web Development", "Machine Learning", "Cybersecurity"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, domains);
        spinnerDomain.setAdapter(adapter);

        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String email = etEmail.getText().toString().trim();
            String phone = etPhone.getText().toString().trim();

            if (name.isEmpty()) { etName.setError("Name is required"); return; }
            if (email.isEmpty() || !email.contains("@")) { etEmail.setError("Valid email is required"); return; }
            if (phone.isEmpty() || phone.length() < 10) { etPhone.setError("Valid phone number is required"); return; }

            int selectedGenderId = rgGender.getCheckedRadioButtonId();
            String gender = "Not specified";
            if (selectedGenderId != -1) {
                RadioButton selectedGender = findViewById(selectedGenderId);
                gender = selectedGender.getText().toString();
            }

            String domain = spinnerDomain.getSelectedItem().toString();
            if (domain.equals("Select Domain")) {
                Toast.makeText(this, "Please select a domain", Toast.LENGTH_SHORT).show();
                return;
            }

            String result = "✅ Form Submitted Successfully!\n\n"
                + "📛 Name: " + name + "\n"
                + "📧 Email: " + email + "\n"
                + "📱 Phone: " + phone + "\n"
                + "👤 Gender: " + gender + "\n"
                + "💻 Domain: " + domain;

            tvResult.setText(result);
            tvResult.setVisibility(View.VISIBLE);
            Toast.makeText(this, "Form submitted successfully!", Toast.LENGTH_LONG).show();
        });

        btnClear.setOnClickListener(v -> {
            etName.setText("");
            etEmail.setText("");
            etPhone.setText("");
            rgGender.clearCheck();
            spinnerDomain.setSelection(0);
            tvResult.setVisibility(View.GONE);
            Toast.makeText(this, "Form cleared", Toast.LENGTH_SHORT).show();
        });
    }
}

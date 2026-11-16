package com.cognifyz.internship.task7;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;
import java.util.List;

public class DatabaseActivity extends AppCompatActivity {

    private DatabaseHelper dbHelper;
    private ListView lvUsers;
    private TextView tvCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);

        dbHelper = new DatabaseHelper(this);

        EditText etDbName = findViewById(R.id.etDbName);
        EditText etDbEmail = findViewById(R.id.etDbEmail);
        Spinner spinnerDbDomain = findViewById(R.id.spinnerDbDomain);
        Button btnAdd = findViewById(R.id.btnDbAdd);
        Button btnClearAll = findViewById(R.id.btnDbClearAll);
        lvUsers = findViewById(R.id.lvDbUsers);
        tvCount = findViewById(R.id.tvDbCount);

        String[] domains = {"Android Development", "Data Science", "Web Development", "Machine Learning", "Cybersecurity"};
        ArrayAdapter<String> domainAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, domains);
        spinnerDbDomain.setAdapter(domainAdapter);

        refreshList();

        btnAdd.setOnClickListener(v -> {
            String name = etDbName.getText().toString().trim();
            String email = etDbEmail.getText().toString().trim();
            String domain = spinnerDbDomain.getSelectedItem().toString();

            if (name.isEmpty()) { etDbName.setError("Required"); return; }
            if (email.isEmpty() || !email.contains("@")) { etDbEmail.setError("Valid email required"); return; }

            long result = dbHelper.addUser(name, email, domain);
            if (result != -1) {
                Toast.makeText(this, "User added successfully!", Toast.LENGTH_SHORT).show();
                etDbName.setText("");
                etDbEmail.setText("");
                refreshList();
            } else {
                Toast.makeText(this, "Error adding user", Toast.LENGTH_SHORT).show();
            }
        });

        btnClearAll.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                .setTitle("Clear All Data")
                .setMessage("Are you sure you want to delete all records?")
                .setPositiveButton("Yes", (dialog, which) -> {
                    dbHelper.deleteAllUsers();
                    refreshList();
                    Toast.makeText(this, "All records deleted", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("No", null)
                .show();
        });
    }

    private void refreshList() {
        List<String> users = dbHelper.getAllUsers();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, users);
        lvUsers.setAdapter(adapter);
        tvCount.setText("Total Records: " + dbHelper.getUserCount());
    }
}

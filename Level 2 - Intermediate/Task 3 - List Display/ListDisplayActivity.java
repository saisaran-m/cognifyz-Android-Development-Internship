package com.cognifyz.internship.task3;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.cognifyz.internship.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_display);

        ListView listView = findViewById(R.id.listView);

        List<String> programmingLanguages = new ArrayList<>(Arrays.asList(
            "☕ Java - The backbone of Android",
            "🎯 Kotlin - Modern Android development",
            "🐍 Python - AI & Machine Learning",
            "🌐 JavaScript - Web Development",
            "🍎 Swift - iOS Development",
            "⚙️ C++ - System Programming",
            "🎮 C# - Game Development (Unity)",
            "🦀 Rust - Systems Programming",
            "💎 Ruby - Web Development (Rails)",
            "📊 R - Statistical Computing",
            "🐘 PHP - Server-side Development",
            "🏃 Go - Cloud & DevOps",
            "📱 Dart - Flutter Development",
            "🔧 TypeScript - Type-safe JavaScript",
            "🧮 MATLAB - Scientific Computing"
        ));

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                R.layout.list_item, R.id.tvListItem, programmingLanguages) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);
                // Alternate row colors
                if (position % 2 == 0) {
                    view.setBackgroundColor(getResources().getColor(R.color.white));
                } else {
                    view.setBackgroundColor(getResources().getColor(R.color.card_bg));
                }
                return view;
            }
        };

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            String selected = programmingLanguages.get(position);
            Toast.makeText(this, "Selected: " + selected, Toast.LENGTH_SHORT).show();
        });
    }
}

package com.cognifyz.internship.task5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.cognifyz.internship.R;
import java.util.ArrayList;
import java.util.List;

public class FetchDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_data);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<CourseItem> courseList = fetchData();
        CourseAdapter adapter = new CourseAdapter(courseList);
        recyclerView.setAdapter(adapter);
    }

    private List<CourseItem> fetchData() {
        List<CourseItem> items = new ArrayList<>();
        items.add(new CourseItem("Android Development", "Learn to build mobile apps with Java & Kotlin", "⭐ 4.8", "12 Weeks", "#4CAF50"));
        items.add(new CourseItem("Data Science", "Master Python, ML, and Data Analytics", "⭐ 4.9", "16 Weeks", "#2196F3"));
        items.add(new CourseItem("Web Development", "Full-stack web development with React & Node", "⭐ 4.7", "14 Weeks", "#FF9800"));
        items.add(new CourseItem("Machine Learning", "Deep learning, Neural Networks & AI", "⭐ 4.9", "20 Weeks", "#9C27B0"));
        items.add(new CourseItem("Cybersecurity", "Network security, Ethical hacking & more", "⭐ 4.6", "10 Weeks", "#F44336"));
        items.add(new CourseItem("Cloud Computing", "AWS, Azure, GCP cloud platforms", "⭐ 4.7", "12 Weeks", "#00BCD4"));
        items.add(new CourseItem("DevOps Engineering", "CI/CD, Docker, Kubernetes & automation", "⭐ 4.5", "8 Weeks", "#795548"));
        items.add(new CourseItem("UI/UX Design", "User research, wireframes & prototyping", "⭐ 4.8", "10 Weeks", "#E91E63"));
        items.add(new CourseItem("Blockchain", "Smart contracts, DApps & crypto", "⭐ 4.4", "14 Weeks", "#FF5722"));
        items.add(new CourseItem("IoT Development", "Sensors, embedded systems & connectivity", "⭐ 4.5", "12 Weeks", "#607D8B"));
        return items;
    }
}

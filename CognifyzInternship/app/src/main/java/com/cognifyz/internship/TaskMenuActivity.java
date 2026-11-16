package com.cognifyz.internship;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import com.cognifyz.internship.task1.HelloWorldActivity;
import com.cognifyz.internship.task2.ButtonInteractionActivity;
import com.cognifyz.internship.task3.ListDisplayActivity;
import com.cognifyz.internship.task4.BasicUILayoutActivity;
import com.cognifyz.internship.task5.FetchDataActivity;
import com.cognifyz.internship.task6.SimpleFormActivity;
import com.cognifyz.internship.task7.DatabaseActivity;
import com.cognifyz.internship.task8.NavigationHomeActivity;

public class TaskMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_menu);

        setupTaskCard(R.id.cardTask1, "Task 1", "Hello World App", "Level 1: Beginner", HelloWorldActivity.class);
        setupTaskCard(R.id.cardTask2, "Task 2", "Button Interaction", "Level 1: Beginner", ButtonInteractionActivity.class);
        setupTaskCard(R.id.cardTask3, "Task 3", "List Display", "Level 2: Intermediate", ListDisplayActivity.class);
        setupTaskCard(R.id.cardTask4, "Task 4", "Basic UI Layout", "Level 2: Intermediate", BasicUILayoutActivity.class);
        setupTaskCard(R.id.cardTask5, "Task 5", "Fetch & Display Data", "Level 3: Advanced", FetchDataActivity.class);
        setupTaskCard(R.id.cardTask6, "Task 6", "Simple Form", "Level 3: Advanced", SimpleFormActivity.class);
        setupTaskCard(R.id.cardTask7, "Task 7", "Database Usage", "Level 4: Expert", DatabaseActivity.class);
        setupTaskCard(R.id.cardTask8, "Task 8", "Navigation", "Level 4: Expert", NavigationHomeActivity.class);
    }

    private void setupTaskCard(int cardId, String taskNum, String taskName, String level, Class<?> activityClass) {
        CardView card = findViewById(cardId);
        card.setOnClickListener(v -> {
            Intent intent = new Intent(TaskMenuActivity.this, activityClass);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        });
    }
}

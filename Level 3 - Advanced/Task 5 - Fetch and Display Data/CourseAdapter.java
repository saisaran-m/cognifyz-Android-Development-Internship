package com.cognifyz.internship.task5;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.cognifyz.internship.R;
import java.util.List;

public class CourseAdapter extends RecyclerView.Adapter<CourseAdapter.CourseViewHolder> {

    private List<CourseItem> courseList;

    public CourseAdapter(List<CourseItem> courseList) {
        this.courseList = courseList;
    }

    @NonNull
    @Override
    public CourseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_course, parent, false);
        return new CourseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CourseViewHolder holder, int position) {
        CourseItem item = courseList.get(position);
        holder.tvTitle.setText(item.getTitle());
        holder.tvDescription.setText(item.getDescription());
        holder.tvRating.setText(item.getRating());
        holder.tvDuration.setText(item.getDuration());
        holder.colorStrip.setBackgroundColor(Color.parseColor(item.getColor()));

        holder.cardView.setOnClickListener(v ->
            Toast.makeText(v.getContext(), "Enrolled in: " + item.getTitle(), Toast.LENGTH_SHORT).show()
        );
    }

    @Override
    public int getItemCount() {
        return courseList.size();
    }

    static class CourseViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        View colorStrip;
        TextView tvTitle, tvDescription, tvRating, tvDuration;

        CourseViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.courseCard);
            colorStrip = itemView.findViewById(R.id.colorStrip);
            tvTitle = itemView.findViewById(R.id.tvCourseTitle);
            tvDescription = itemView.findViewById(R.id.tvCourseDescription);
            tvRating = itemView.findViewById(R.id.tvCourseRating);
            tvDuration = itemView.findViewById(R.id.tvCourseDuration);
        }
    }
}

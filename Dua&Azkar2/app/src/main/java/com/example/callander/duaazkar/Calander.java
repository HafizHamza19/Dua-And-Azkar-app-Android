package com.example.callander.duaazkar;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.eltohamy.materialhijricalendarview.CalendarDay;
import com.github.eltohamy.materialhijricalendarview.MaterialHijriCalendarView;

public class Calander extends AppCompatActivity {

    com.github.eltohamy.materialhijricalendarview.MaterialHijriCalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calander);
        calendarView = (com.github.eltohamy.materialhijricalendarview.MaterialHijriCalendarView) findViewById(R.id.calendarView);
        calendarView.setOnDateChangedListener(new com.github.eltohamy.materialhijricalendarview.OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialHijriCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                Toast.makeText(widget.getContext(), "" + date + "", Toast.LENGTH_SHORT).show();

            }

        });

    }
}

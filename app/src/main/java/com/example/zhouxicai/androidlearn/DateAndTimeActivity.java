package com.example.zhouxicai.androidlearn;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class DateAndTimeActivity extends AppCompatActivity {

    private DatePicker z_DP1, z_DP2;
    private TimePicker z_TP1, z_TP2;
    private CalendarView z_CDV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_and_time);

        z_DP1 = findViewById(R.id.dp_1);
        z_DP2 = findViewById(R.id.dp_2);
        setOnDateChange();

        z_TP1 = findViewById(R.id.tp_1);
        z_TP2 = findViewById(R.id.tp_2);
        setOnTimeChange();

        z_CDV = findViewById(R.id.CDV);
        z_CDV.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int monthOfYear, int dayOfMonth) {
                Toast.makeText(DateAndTimeActivity.this,"您选择的日期是："+year+"年"+(monthOfYear+1)+"月"+dayOfMonth+"日!",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setOnDateChange(){
        onDateChange onDateCh = new onDateChange();
        z_DP1.setOnDateChangedListener(onDateCh);
        z_DP2.setOnDateChangedListener(onDateCh);
    }
    private class onDateChange implements DatePicker.OnDateChangedListener{

        @Override
        public void onDateChanged(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
            Toast.makeText(DateAndTimeActivity.this,"您选择的日期是："+year+"年"+(monthOfYear+1)+"月"+dayOfMonth+"日!",Toast.LENGTH_SHORT).show();

        }
    }
    private void setOnTimeChange(){
        onTimeChange change = new onTimeChange();
        z_TP1.setOnTimeChangedListener(change);
        z_TP2.setOnTimeChangedListener(change);
    }
    private class onTimeChange implements TimePicker.OnTimeChangedListener{

        @Override
        public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            Toast.makeText(DateAndTimeActivity.this,"您选择的时间是："+hourOfDay+"时"+minute+"分!",Toast.LENGTH_SHORT).show();

        }
    }
}

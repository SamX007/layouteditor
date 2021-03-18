package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helloconstraint.R;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        if (Integer.parseInt(mShowCount.getText().toString()) == 0) {
            findViewById(R.id.button_zero).setBackgroundColor(Color.BLUE);
        }
        mCount++;
        if((Integer.parseInt(mShowCount.getText().toString()) % 2) == 0){
            view.setBackgroundColor(Color.GREEN);
        }
        else{
            view.setBackgroundColor(Color.RED);
        }
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void reset(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        view.setBackgroundColor(Color.BLACK);
        findViewById(R.id.button_count).setBackgroundColor(Color.parseColor("#FF6200EE"));
    }
}
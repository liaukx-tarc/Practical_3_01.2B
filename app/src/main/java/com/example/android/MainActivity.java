package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button mResetButton;
    private Button mCountButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mResetButton = findViewById(R.id.button_zero);
        mCountButton = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        mResetButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        mResetButton.setClickable(true);

        if (mCount % 2 == 0) { //if mCount mod 2 is 0, number is even otherwise odd
            view.setBackgroundColor(Color.BLUE);
        }

        else
        {
            view.setBackgroundColor(Color.GREEN);
        }

    }

    public void countZero(View view){
         mCount = 0;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));

        view.setClickable(false);
        view.setBackgroundColor(Color.GRAY);
        mCountButton.setBackgroundColor(getResources().getColor(R.color.colorPrimary));

    }
}
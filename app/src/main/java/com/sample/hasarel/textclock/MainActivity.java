package com.sample.hasarel.textclock;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextClock mTcClock;
    private TextView mTvView;
    private Button mBtnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTcClock =  findViewById(R.id.main_activity_tc_clock1);
        mTvView =  findViewById(R.id.textview1);
        mBtnClick = findViewById(R.id.main_activity_btn_click);
        mBtnClick.setOnClickListener(this);
    }

    private void textClock(){
        mTvView.setText("Time: "+mTcClock.getText());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.main_activity_btn_click:
                textClock();
                break;
            default:
                break;
        }
    }
}
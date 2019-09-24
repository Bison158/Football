package com.example.football;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Integer counter = 0;
    TextView counterView;
    Button btn;
    final String TAG = "StartActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        counterView = findViewById(R.id.txt_counter);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("counter", counter);
    }
    @Override
    public void onRestoreInstanceState(Bundle saveInstanceState){
        super.onRestoreInstanceState(saveInstanceState);
        if(saveInstanceState != null && saveInstanceState.containsKey("counter")){
            counter = saveInstanceState.getInt("counter", counter);
            counterView.setText(String.valueOf(counter));

        }
    }


    public void onClickBtnAddStudents(View view) {
        counter++;
        counterView.setText(String.valueOf(counter));
    }
}


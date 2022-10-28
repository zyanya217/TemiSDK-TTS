package com.robotemi.sdk.sample;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;

import com.robotemi.sdk.Robot;
import com.robotemi.sdk.TtsRequest;
import java.util.List;

public class MainActivity extends AppCompatActivity implements
        Robot.TtsListener {

    private Robot robot;
    private static final String Speak = "123 哈囉 我是temi ";

    protected void onStart() {
        super.onStart();
        Robot.getInstance().addTtsListener(this);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
    }
//    public void initViews(){
//        etSpeak = findViewById(R.id.etSpeak);
//
//    }

      /*
        Have the robot speak while displaying what is being said.
     */

    public void speak(View view) {
        TtsRequest ttsRequest = TtsRequest.create(Speak,true);
        robot.speak(ttsRequest);
    }

    @Override
    public void onTtsStatusChanged(TtsRequest ttsRequest) {

        // Do whatever you like upon the status changing. after the robot finishes speaking
        // Toast.makeText(this, "speech: " + ttsRequest.getSpeech() + "\nstatus:" + ttsRequest.getStatus(), Toast.LENGTH_LONG).show();
    }

}

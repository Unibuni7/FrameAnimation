package com.example.slmns.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    boolean walking;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        button = (Button) findViewById(R.id.Button);
        walking = false;

       // ((AnimationDrawable) imageView.getDrawable()).start();
    }

    public void Walk(View view) {
        if (!walking){
            ((AnimationDrawable) imageView.getDrawable()).start();
            walking = true;
        } else {
            ((AnimationDrawable) imageView.getDrawable()).stop();
            walking = false;
        }

    }
}

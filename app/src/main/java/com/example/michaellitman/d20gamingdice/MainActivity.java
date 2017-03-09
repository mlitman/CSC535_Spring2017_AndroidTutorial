package com.example.michaellitman.d20gamingdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView tv;
    private Button firstButton;
    private Button lastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.tv = (TextView)this.findViewById(R.id.myLabel);
        this.firstButton = (Button)this.findViewById(R.id.firstButton);
        this.lastButton = (Button)this.findViewById(R.id.lastButton);
    }

    public void button1Pressed(View sender)
    {
        if(sender == this.firstButton)
        {
            this.tv.setText("Mike");
        }
        else if(sender == this.lastButton)
        {
            this.tv.setText("Litman");
        }
    }


}

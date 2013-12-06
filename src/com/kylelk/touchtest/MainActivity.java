package com.kylelk.touchtest;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		final TextView xCoord = (TextView) findViewById(R.id.xC);
		final TextView yCoord = (TextView) findViewById(R.id.yC);
		final View touchView = findViewById(R.id.touchArea);
		
		touchView.setOnTouchListener(new View.OnTouchListener() {

				public boolean onTouch(View v, MotionEvent event) {
					final int action = event.getAction();
	
					switch (action & MotionEvent.ACTION_MASK) {

						case MotionEvent.ACTION_DOWN: {
								xCoord.setText(String.valueOf((int) event.getX()));
								yCoord.setText(String.valueOf((int) event.getY()));
								break;
							}

						case MotionEvent.ACTION_MOVE:{
								xCoord.setText(String.valueOf((int) event.getX()));
								yCoord.setText(String.valueOf((int) event.getY()));
								break;
							}
					}
					return true;
			}
		});
    }
}

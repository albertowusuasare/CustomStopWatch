package com.example.customstopwatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class TimerActivity extends Activity {

	/**
	 * This class performs the necessary interface for the Chronometer functionality
	 */
	
	/**
	 * Fields:
	 * mainChronometer : reference to main chronometer used.
	 * startButton     : reference to start button.
	 * stopButton      : reference to stop button.
	 */
	
	private Chronometer mainChronometer;
	private Button startButton;
	private Button stopButton;
	private TextView logOutText;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timer);
		
		/* set class fields */
		
		mainChronometer = (Chronometer) findViewById(R.id.mainChronometer);
		startButton = (Button) findViewById(R.id.start_button);
		stopButton = (Button) findViewById(R.id.stop_button);
		logOutText = (TextView) findViewById(R.id.logoutText);
		final boolean touch = false;
		
		// When start button is clicked
		
		startButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			
			mainChronometer.start();
			}
		});
		
		stopButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			mainChronometer.stop();
			//stop the counter 
				
			}
		});
		
		// When textview is clicked
		logOutText.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				
			//	getActivity().getFragmentManager().popBackStack();
			Intent startUp = new Intent(TimerActivity.this, MainActivity.class);
			startActivity(startUp);
			//finish();
			
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.timer, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

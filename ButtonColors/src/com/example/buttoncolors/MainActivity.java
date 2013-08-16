package com.example.buttoncolors;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.LightingColorFilter;
import android.view.Menu;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		final Button button = (Button) findViewById(R.id.buttonGreen);
		button.getBackground().setColorFilter(new LightingColorFilter(0xff00ff00, 0xff00ff00));

		final Button buttonRed = (Button) findViewById(R.id.buttonRed);
		buttonRed.getBackground().setColorFilter(new LightingColorFilter(0xffff0000, 0xffff0000));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

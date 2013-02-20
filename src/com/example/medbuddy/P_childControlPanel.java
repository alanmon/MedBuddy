package com.example.medbuddy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class P_childControlPanel extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.child_control_panel);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.child_control_panel, menu);
		return true;
	}

}

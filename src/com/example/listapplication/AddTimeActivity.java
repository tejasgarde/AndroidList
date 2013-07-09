package com.example.listapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class AddTimeActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_time);
	}
	
	public void onCancel(View view){
		finish();
	}

}

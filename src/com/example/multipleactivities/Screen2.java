package com.example.multipleactivities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends Activity{

	MainActivity main;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_screen2);
		((TextView)findViewById(R.id.editText1)).setText(getIntent().getStringExtra("one",0));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void changeScreen(View v){
		Intent intent = new Intent(this,Screen2.class);
		startActivity(intent);
	}
}

package com.example.multipleactivities;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	/*
	 	String one = ((TextView)findViewById(R.id.editText1)).getText().toString();
		String two = ((TextView)findViewById(R.id.editText2)).getText().toString();
		String three = ((TextView)findViewById(R.id.editText3)).getText().toString();
	 */
	public void changeScreen(View v){
		Intent intent = new Intent(this,Screen2.class);
		intent.putExtra("one",((TextView)findViewById(R.id.editText1)).getText().toString());
		intent.putExtra("two",((TextView)findViewById(R.id.editText2)).getText().toString());
		intent.putExtra("three",((TextView)findViewById(R.id.editText3)).getText().toString());
		startActivity(intent);
	}
	

}

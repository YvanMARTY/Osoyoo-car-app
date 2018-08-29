package com.vk.BTcar;

import com.example.android.BTcar.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoadingActivity extends Activity {
	private Button but_wifi;
	private Button but_blue;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_loading);

		but_wifi = findViewById(R.id.but_wifi);
		but_wifi.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent intent = new Intent(LoadingActivity.this, MainActivity.class);
				startActivity(intent);
			}
		});


		but_blue = findViewById(R.id.but_blue);
		but_blue.setOnClickListener(new OnClickListener(){
			public void onClick(View v) {
				Intent intent = new Intent(LoadingActivity.this, BTcar.class);
				startActivity(intent);
			}
		});


	}

	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_BACK ) {
			finish();

			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

}

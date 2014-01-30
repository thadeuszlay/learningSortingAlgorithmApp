package com.example.options;

import com.example.appsearchalogrithm.R;
import com.example.appsearchalogrithm.R.layout;
import com.example.appsearchalogrithm.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.TextView;

public class HeapSortActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_heap_sort);
		
		TextView tv=(TextView)findViewById(R.id.tvHeap);
		tv.setMovementMethod(new ScrollingMovementMethod());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.heap_sort, menu);
		return true;
	}

}

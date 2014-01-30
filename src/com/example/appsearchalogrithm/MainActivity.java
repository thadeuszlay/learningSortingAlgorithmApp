package com.example.appsearchalogrithm;

import com.example.options.BubbleSortActivity;
import com.example.options.BucketSortActivity;
import com.example.options.HeapSortActivity;
import com.example.options.InsertionSortActivity;
import com.example.options.MergeSortActivity;
import com.example.options.QuickSortActivity;
import com.example.options.RadixSortActivity;
import com.example.options.SelectionSortActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button bBubbleSort=(Button)findViewById(R.id.bBubbleSort);
		Button bSelectionSort=(Button)findViewById(R.id.bSelectionSort);
		Button bInsertionSort=(Button)findViewById(R.id.bInsertionSort);
		Button bBucketSort=(Button)findViewById(R.id.bBucketSort);
		Button bRadixSort=(Button)findViewById(R.id.bRadixSort);
		Button bQuickSort=(Button)findViewById(R.id.bQuicksort);
		Button bMergeSort=(Button)findViewById(R.id.bMergeSort);
		Button bHeapSort=(Button)findViewById(R.id.bHeapSort);
		
		bBubbleSort.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent=new Intent(MainActivity.this, BubbleSortActivity.class);
				startActivity(intent);
			}
			
		});
		
		bSelectionSort.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent=new Intent(MainActivity.this, SelectionSortActivity.class);
				startActivity(intent);
			}
	
		});
		
		bInsertionSort.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent=new Intent(MainActivity.this, InsertionSortActivity.class);
				startActivity(intent);
			}
			
		});
		
		bBucketSort.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent=new Intent(MainActivity.this, BucketSortActivity.class);
				startActivity(intent);
			}
			
		});
		
		bRadixSort.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent=new Intent(MainActivity.this, RadixSortActivity.class);
				startActivity(intent);
			}
			
		});
		bQuickSort.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent=new Intent(MainActivity.this, QuickSortActivity.class);
				startActivity(intent);
			}
			
		});
		bMergeSort.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent=new Intent(MainActivity.this, MergeSortActivity.class);
				startActivity(intent);
			}
			
		});
		bHeapSort.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent;
				intent =new Intent(MainActivity.this, HeapSortActivity.class);
				startActivity(intent);
			}
			
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
